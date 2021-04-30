
package Thread;
import java.util.Random;

public class Comprador extends Thread {
    private Produto produto;
    double gerador;
    Random random = new Random();
    
    public Comprador(Produto produto, String nome){
        super(nome);
        this.produto = produto;
    }
    
    public void run( ) {
        try{
            Thread.sleep(30000);
            gerador = 1 + (int) (Math.random() * 10);
            int escolha = random.nextInt(1);
            if(escolha == 0){
                produto.SetMaiorValor(gerador);
            }
        }catch(InterruptedException ex){
            System.out.println("Erro ao Executar a thread!");
        } 
    }
}
