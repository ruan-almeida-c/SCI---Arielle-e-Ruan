
    package Thread;

    public class Principal {
        public static void main(String[] args){

            Produto mesa = new Produto(20);

            Comprador Comprador1 = new Comprador(mesa, "comprador1");
            Comprador1.start();
            Comprador Comprador2 = new Comprador(mesa, "comprador2");
            Comprador2.start();
            Comprador Comprador3 = new Comprador(mesa, "comprador3");
            Comprador3.start();
            Comprador Comprador4 = new Comprador(mesa, "comprador4");
            Comprador4.start();
            Comprador Comprador5 = new Comprador(mesa, "comprador5");
            Comprador5.start(); 


            while(!mesa.CheckValorIdealLeiloado()){
                continue;
            }
            Comprador1.interrupt();
            Comprador2.interrupt();
            Comprador3.interrupt();
            Comprador4.interrupt();
            Comprador5.interrupt();
            System.out.println(mesa.getMaiorValor());

        }
    }
