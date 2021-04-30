package CursoModel;


public class Professor extends Pessoa{
	private double valorHora;
	private String linguasLec;
	
	public Professor(String Nome, String Matricula, String Endereco,
			String telefone, double valorHora, String linguasLec) {
		super(Nome, Matricula, Endereco, telefone);
		this.linguasLec = linguasLec;
		this.valorHora = valorHora;
	}
	
	public String getLinguasLec() {
		return linguasLec;
	}
	public void setLinguasLec(String linguasLec) {
		this.linguasLec = linguasLec;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
