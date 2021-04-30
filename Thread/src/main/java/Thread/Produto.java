
package Thread;

public class Produto {
   private double valorIdeal;
   private double maiorValor = 0;
   private enum Status{A_LEILOAR, EM_LEILAO, LEILOADO };
   private Status statusAtual;
   
   public Produto(double valorIdeal){
       this.valorIdeal = valorIdeal;
       this.statusAtual = Status.A_LEILOAR;
   }  
   
   public double getValorIdeal(){
       return this.valorIdeal;
   }
   
   public double getMaiorValor(){
       return this.maiorValor;
   }
   
   private void SetStatusEmLeilao(){
        this.statusAtual = Status.EM_LEILAO;
   }
   
    public synchronized boolean CheckValorIdealLeiloado(){
       if(this.maiorValor >= this.valorIdeal){
           this.statusAtual = Status.LEILOADO;
           return true;
       }
       return false;
   }
   
    public void SetMaiorValor(double valor){
            this.maiorValor = this.maiorValor + valor;

   }
   
    public synchronized String getStatus(){
        return this.statusAtual.name();
    }
}
