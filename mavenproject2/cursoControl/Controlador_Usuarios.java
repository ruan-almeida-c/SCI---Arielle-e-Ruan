
public class Controlador_Usuarios {
	
	private final ArrayList<Aluno> listaAluno = new ArrayList();
	
	public void CadastroAluno(String Nome, String Matricula, String Endereco,
			String telefone, String email, int codigo) {
		
		Aluno al = new Aluno(Nome, Matricula, Endereco, telefone, email, codigo);
		listaAluno.add(al);
	}
	public void ConsultaAluno() {
		
	}
	public void CadastroProfessor() {
	
	}
	public void ConsultaProfessor() {
	
	}
}
