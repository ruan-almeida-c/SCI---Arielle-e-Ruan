package CursoModel;


public class Professor extends Pessoa{
    private double valorHora;
    private int linguasLec;
        
    public enum Linguas{
        INGLES(1), ESPANHOL(2), FRANCES(3), INGLES_ESPANHOL(4), 
        INGLES_FRANCES(5),ESPANHOL_FRANCES(6), TODAS(7);

        public int idLinguas;
        Linguas(int id){
            idLinguas = id;
            }
        
        public int getIdLinguas(){
            return idLinguas;
        }
    }
    
    public Professor(String Nome, String Matricula, String Endereco,
			String telefone, double valorHora, int linguasLec) {
        super(Nome, Matricula, Endereco, telefone);
        this.linguasLec = linguasLec;
        this.valorHora = valorHora;
	}

    @Override
    public String toString() {
        int id = this.linguasLec;
        String nomeLingua = null;
        for(Linguas op : Linguas.values()){
            if(op.idLinguas == id){
               nomeLingua = op.toString();
            }
        }
        return super.toString() + this.valorHora +" "+ nomeLingua; 
    }
        
    
    public int getLinguasLec() {
        return linguasLec;
    }
    public void setLinguasLec(int linguasLec) {
        this.linguasLec = linguasLec;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }	
}
