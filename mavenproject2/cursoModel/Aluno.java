
public class Aluno extends Pessoa {
	private String email;
	private int codigo;
	
	
	public Aluno(String Nome, String Matricula, String Endereco,
			String telefone, String email, int codigo) {
		super(Nome, Matricula, Endereco, telefone);
		this.codigo = codigo;
		this.email = email;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
