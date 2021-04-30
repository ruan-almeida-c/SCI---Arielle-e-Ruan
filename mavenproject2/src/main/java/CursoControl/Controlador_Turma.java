package CursoControl;

import CursoModel.Turma;
import CursoControl.Controlador_Usuarios;
import CursoModel.Aluno;
import java.util.ArrayList;

public class Controlador_Turma {
        
        private final ArrayList<Turma> listaTurmas = new ArrayList();
	Controlador_Usuarios ctl = new Controlador_Usuarios(); 
        
        private void insereAlunoTurma(String matricula, String idTurma){
            for(int i=0;i<ctl.getListaAluno().size();i++){
                if(ctl.getListaAluno().get(i).getMatricula().equals(matricula)){
                    Aluno al = ctl.getListaAluno().get(i);
                    
                    for(int k=0;k<listaTurmas.size();k++){
                        if(listaTurmas.get(k).getId().equals(idTurma)){
                            listaTurmas.get(k).insereAlunoTurma(al);
                        }   
                    }
                }
            } 
        }
        
        public void RegistrarNotaAluno(String idTurma, String matricula, float notaAluno) {
            for(int i=0;i<listaTurmas.size();i++){
                if(listaTurmas.get(i).getId().equals(idTurma)){
                    listaTurmas.get(i).setNota(matricula, notaAluno);
                }
            }
	}
	public void consultarTurma(String idTurma) {
            for(int i = 0;i<listaTurmas.size();i++){
                if(listaTurmas.get(i).getId().equals(idTurma)){
                   listaTurmas.get(i).toString();
                }
            }
	}
	public void cadastrarTurma(String id, int anoInicio, int mesInicio, int diaInicio, int horaInicio,
			int minInicio, int anoFim, int mesFim, int diaFim, int horaFim,
			int minFim, String lingua, String nivel, double preco) {
            
            Turma tur = new Turma(id, anoInicio, mesInicio, diaInicio, horaInicio,
            minInicio, anoFim, mesFim, diaFim, horaFim, minFim, lingua, nivel, preco);
            
            listaTurmas.add(tur);
	}
        
        public String consultarTodasTurmas(){
            return listaTurmas.toString();
        }
        
        public void consultarAlunosTurma(String idTurma){
            for(int i = 0;i<listaTurmas.size();i++){
                if(listaTurmas.get(i).getId().equals(idTurma)){
                    listaTurmas.get(i).getListaAlunos();
                }
            }
        }
        
        /*public void alterarTurma(int opcao, String campo){
            switch(opcao){
                case 1:
                  for (int i=0;i<listaTurmas.size();i++){
           
                    if(listaTurmas.get(i).){
                        listaProf.get(i).setNome(campo);
                        System.out.println("Nome do Professor alterado!");

                    }
                }break;  
            }
        }*/
}
