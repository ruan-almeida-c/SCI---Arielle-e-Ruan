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
    
    public ArrayList<Aulas> consultarAulas(int mes, int ano){
        ArrayList<Aulas> ListaTemp = new ArrayList<>();
        
        ListaDeAulas.forEach(aula -> {
            if(aula.getDataInicio().getMonthValue() == mes && aula.getDataInicio().getYear() == ano){
                ListaTemp.add(aula);
            }
        });
        
        return ListaTemp;
    }
    
    public ArrayList<Aulas> consultarAulas(int mes){
        ArrayList<Aulas> ListaTemp = new ArrayList<>();
        
        ListaDeAulas.forEach(aula -> {
            if(aula.getDataInicio().getMonthValue() == mes){
                ListaTemp.add(aula);
            }
        });
        
        return ListaTemp;
    }
    
    public void postergarAula(int ano, int mes, int dia, int hora, int min, char id){
        consultarAulas(id).setDataInicio(ano,mes,dia,hora,min);
    }
    
    public void selecionarProfessor(Professor professor, char id){
        consultarAulas(id).setProfessor(professor);
    }
    
    public void Modificar(char Id, int anoInicio, int mesInicio, int diaInicio, int horaInicio, int minInicio, int anoFim, int mesFim, int diaFim, int horaFim, int minFim, double custo, Turma turma){
        Aulas aula = this.consultarAulas(Id);
        aula.setCusto(custo);
        aula.setDataInicio(anoInicio,mesInicio, diaInicio, horaInicio, minInicio);
        aula.setDataFim(anoFim,mesFim, diaFim, horaFim, minFim);

        if(turma != null){
            aula.setTurma(turma);
        }
    }
}
