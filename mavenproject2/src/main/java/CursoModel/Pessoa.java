package CursoModel;

public abstract class Pessoa {
	private String Nome;
	private String Matricula;
	private String Endereco;
	private String telefone;
	
	public Pessoa(String Nome, String Matricula, String Endereco, String telefone) {
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Matricula = Matricula;
		this.telefone = telefone;
	}

    @Override
    public String toString() {
        return this.Nome +" "+ this.Matricula +" "+ this.Endereco +" "+ this.telefone +" "; //To change body of generated methods, choose Tools | Templates.
    }
        
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}