package CursoControl;
import CursoModel.Aluno;
import CursoModel.Professor;

import java.util.ArrayList;


public class Controlador_Usuarios {

    private final ArrayList<Aluno> listaAluno = new ArrayList();
    private final ArrayList<Professor> listaProf = new ArrayList();


    public void CadastroAluno(String Nome, String Matricula, String Endereco, String telefone, String email, int codigo) {
        Aluno al = new Aluno(Nome, Matricula, Endereco, telefone, email, codigo);
        listaAluno.add(al); 
    }
    public void ConsultaAluno(String Matricula) {
        int aux = 0;
        for (int i=0;i<listaAluno.size();i++){
            if(listaAluno.get(i).getMatricula().equals(Matricula)){
                System.out.println(listaAluno.get(i));
                aux++;
            }
        }
        if (aux == 0)
            System.out.println("Não existe aluno com essa matrícula!");
            
    }
    public void CadastroProfessor(String Nome, String Matricula, String Endereco,
                    String telefone, double valorHora, int linguasLec) {
        Professor prof = new Professor(Nome, Matricula, Endereco, telefone, valorHora, linguasLec);
        listaProf.add(prof);
    }
    public void ConsultaProfessor(String Matricula) {
        int aux = 0;
        for (int i=0;i<listaProf.size();i++){
            if(listaProf.get(i).getMatricula().equals(Matricula)){
                System.out.println(listaProf.get(i));
                aux++;
            }
        }
        if (aux == 0)
            System.out.println("Não existe professor com essa matrícula!");
        
    }
    
    public void removerAluno(String Matricula){
        int aux = 0;
        for (int i=0;i<listaAluno.size();i++){
           
            if(listaAluno.get(i).getMatricula().equals(Matricula)){
                listaAluno.remove(i);
                System.out.println("Aluno removido da lista!");
                aux++;
            }
        }
        if(aux == 0){
                System.out.println("Não existe aluno com essa matrícula!");
            }
    }
    
    public void removerProfessor(String Matricula){
        int aux = 0;
        for (int i=0;i<listaProf.size();i++){
           
            if(listaProf.get(i).getMatricula().equals(Matricula)){
                listaProf.remove(i);
                System.out.println("Professor removido da lista!");
                aux++;
            }
        }
        if(aux == 0){
                System.out.println("Não existe professor com essa matrícula!");
            }
    }

    public void alterarCadastroAluno(int opcao, String matricula, String campo){
        switch (opcao){
            case 1: 
               for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        listaAluno.get(i).setNome(campo);
                        System.out.println("Nome do Aluno alterado!");

                    }
                }break;
            case 2:
                for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        listaAluno.get(i).setMatricula(campo);
                        System.out.println("Matrícula do Aluno alterada!");

                    } 
                }break;
            case 3:
                for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        listaAluno.get(i).setEndereco(campo);
                        System.out.println("Endereço do Aluno alterado!");

                    } 
                }break;
            case 4:
                for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        listaAluno.get(i).setTelefone(campo);
                        System.out.println("Telefone do Aluno alterado!");

                    } 
                }break;
            case 5:
                for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        listaAluno.get(i).setEmail(campo);
                        System.out.println("Email do Aluno alterado!");

                    } 
                }break;
            case 6:
                for (int i=0;i<listaAluno.size();i++){
           
                    if(listaAluno.get(i).getMatricula().equals(matricula)){
                        int cod = Integer.parseInt(campo);
                        listaAluno.get(i).setCodigo(cod);
                        System.out.println("Código do Aluno alterado!");

                    } 
                }break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                
        }
    }
    
    public void alterarCadastroProfessor(int opcao, String matricula, String campo){
        switch (opcao){
            case 1: 
               for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        listaProf.get(i).setNome(campo);
                        System.out.println("Nome do Professor alterado!");

                    }
                }break;
            case 2:
                for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        listaProf.get(i).setMatricula(campo);
                        System.out.println("Matrícula do Professor alterada!");

                    }
                }break;
            case 3:
                for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        listaProf.get(i).setEndereco(campo);
                        System.out.println("Endereço do Professor alterado!");

                    } 
                }break;
            case 4:
                for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        listaProf.get(i).setTelefone(campo);
                        System.out.println("Telefone do Professor alterado!");

                    } 
                }break;
            case 5:
                for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        double val = Double.parseDouble(campo);
                        listaProf.get(i).setValorHora(val);
                        System.out.println("Valor/Hora do Professor alterado!");

                    } 
                }break;
            case 6:
                for (int i=0;i<listaProf.size();i++){
           
                    if(listaProf.get(i).getMatricula().equals(matricula)){
                        int aux = Integer.parseInt(campo);
                        listaProf.get(i).setLinguasLec(aux);
                        System.out.println("Linguas do Professor alteradas!");

                    } 
                }break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                
        }
    }

    public ArrayList<Aluno> getListaAluno() {
        return listaAluno;
    }

    public ArrayList<Professor> getListaProf() {
        return listaProf;
    }
    
    
}