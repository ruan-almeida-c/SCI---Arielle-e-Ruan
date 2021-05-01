package CursoModel;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String email;
	private int codigo;
	//private final ArrayList<Aluno> listaAluno = new ArrayList();

        public Aluno() {
            super(null, null, null, null);
        }
        
        
        
	public Aluno(String Nome, String Matricula, String Endereco,
			String telefone, String email, int codigo) {
		super(Nome, Matricula, Endereco, telefone);
		this.codigo = codigo;
		this.email = email;
	}

    @Override
    public String toString() {
        return super.toString() + this.email +" "+ this.codigo; //To change body of generated methods, choose Tools | Templates.
    }
        
        
	/*
        public void insereAlunoLista(Aluno al){
            listaAluno.add(al);
        }
        
        public void getAluno(){
             System.out.println("pudim do Ruan " + listaAluno.size());
            for(int i=0;i<listaAluno.size();i++){ 
                System.out.println(listaAluno.get(i));
            }
        }
*/        

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
