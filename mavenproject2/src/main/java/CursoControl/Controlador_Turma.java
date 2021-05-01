package CursoControl;
import java.time.LocalDateTime;
import CursoModel.Turma;
import CursoControl.Controlador_Usuarios;
import CursoModel.Aluno;
import java.util.ArrayList;

public class Controlador_Turma {
        
        private final ArrayList<Turma> listaTurmas = new ArrayList();
	
        Controlador_Usuarios ctl = new Controlador_Usuarios();
        
        public void insereAlunoTurma(String matricula, String idTurma){
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
        
        public String consultarTodasTurmas(){//imprime as informações de todas as turmas
            return listaTurmas.toString();
        }
        
        public ArrayList<Turma> ConsultaListaTurma(){
            ArrayList<Turma> listaTemp = new ArrayList();
            return listaTemp;
        }
        
        public void consultarAlunosTurma(String idTurma){
            for(int i = 0;i<listaTurmas.size();i++){
                if(listaTurmas.get(i).getId().equals(idTurma)){
                    listaTurmas.get(i).getListaAlunos();
                }
            }
        }
        
        public void exibirNotaAluno(String matricula, String idTurma){
            for(int i = 0;i<listaTurmas.size();i++){
                if(listaTurmas.get(i).getId().equals(idTurma)){
                    for(int k = 0;k<listaTurmas.size();k++){
                        if(listaTurmas.get(k).getListaAlunoNotas().get(k).getAluno().getMatricula().equals(matricula))
                            listaTurmas.get(k).getListaAlunoNotas().get(k).getNot();
                    }
                }
                    
            }
        }
        
        public void removerTurma(String idTurma){
        int aux = 0;
        for (int i=0;i<listaTurmas.size();i++){
           
            if(listaTurmas.get(i).getId().equals(idTurma)){
                listaTurmas.remove(i);
                System.out.println("Turma removida da lista!");
                aux++;
            }
        }
        if(aux == 0){
                System.out.println("Não existe turma com esse identificador!");
            }
    }
        
        public void alterarTurma(int opcao, String campo, String idTurma){
            switch(opcao){
                case 1:
                  for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        listaTurmas.get(i).setId(campo);
                        System.out.println("Id da Turma alterado!");
                    }
                }break;  
                case 2:
                    for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        listaTurmas.get(i).setLingua(campo);
                        System.out.println("Idioma da Turma alterada!");
                    }
                }break; 
                case 3:
                    for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        listaTurmas.get(i).setNivel(campo);
                        System.out.println("Nível da Turma alterada!");
                    }
                }break;
                case 4:
                    for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        double val = Double.parseDouble(campo);
                        listaTurmas.get(i).setPreco(val);
                        System.out.println("Preço da Turma alterada!");
                    }
                }break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
        
        public void alterarTurmaData(int opcao, LocalDateTime data, String idTurma){
            switch(opcao){
                case 1:
                  for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        listaTurmas.get(i).setDataInicio(data);
                        System.out.println("Data Inicio da Turma alterada!");
                    }
                }break;
                case 2:
                    for (int i=0;i<listaTurmas.size();i++){
                    if(listaTurmas.get(i).getId().equals(idTurma)){
                        listaTurmas.get(i).setDataFim(data);
                        System.out.println("Data Fim da Turma alterada!");
                    }
                }break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");

            }
        }
}
