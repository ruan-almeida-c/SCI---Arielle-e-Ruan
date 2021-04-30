package CursoControl;

import CursoModel.Aulas;
import CursoModel.Professor;
import CursoModel.Turma;



import java.util.ArrayList;
import java.util.Date;


public class Controlador_Aulas {
    private final ArrayList<Aulas> ListaDeAulas;

    public Controlador_Aulas() {
        this.ListaDeAulas = new ArrayList<>();
    }
    
    public void adicionarAulas(char Id, Professor professor){
        ListaDeAulas.add( new Aulas(Id, professor));
    }
    public Aulas consultarAulas(char Id){
        return ListaDeAulas.get(Id);
    }
    
    public void consultarAulas(){
        ListaDeAulas.forEach(aula -> {
            System.out.println(aula);
        });
    }
    
    public void postergarAula(Date novaData, char id){
        consultarAulas(id).setData(novaData);
    }
    
    public void selecionarProfessor(Professor professor, char id){
        consultarAulas(id).setProfessor(professor);
    }
    
    public void Modificar(char Id, Date data, Date hInicio, Date hTermino, double Custo, Turma turma){
        Aulas aula = this.consultarAulas(Id);
        if(data != null){
            aula.setData(data);
        }
        
        if(data != null){
            aula.setHInicio(hInicio);
        }
        
        if(data != null){
            aula.setHTermino(hTermino);
        }
        
        if(data != null){
            aula.setCusto(Custo);
        }
        if(data != null){
            aula.setTurma(turma);
        }
    }
}
