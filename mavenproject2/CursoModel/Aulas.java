package CursoModel;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Aulas {
    private final char Id;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private double Custo;
    private Turma turma;
    private Professor professor;

    public Aulas(char Id, Professor professor) {
        this.professor = professor;
        this.Id = Id;
    }
    
    public double CustoTotal(){
        double valorInicio = this.dataInicio.toEpochSecond(ZoneOffset.UTC);        
        double valorFim = this.dataFim.toEpochSecond(ZoneOffset.UTC);
        
        return ((valorFim - valorInicio)/3600 + this.Custo);
    }
    public char getId(){
        return this.Id;
    }
    public LocalDateTime getDataInicio(){
        return this.dataInicio;
    }
    public LocalDateTime  getDataFim(){
        return this.dataFim;
    }
    public double getCusto(){
        return this.Custo;
    }
    public Turma getTurma(){
        return this.turma;
    }
    public Professor getProfessor(){
        return this.professor;
    }
    public void setDataInicio(int ano, int mes, int dia, int hora, int min){
        this.dataInicio = LocalDateTime.of(ano, mes, dia, hora, min);
    }
    public void  setDataFim(int ano, int mes, int dia, int hora, int min){
        this.dataFim = LocalDateTime.of(ano, mes, dia, hora, min);
    }
    public void setCusto(double custo){
        this.Custo = custo;
    }
    public void setTurma( Turma turma ){
        this.turma = turma;
    }
    public void setProfessor( Professor professor){
        this.professor = professor;
    }
    
    public String toString(){
        return "Id: " + this.Id + " data: " + this.dataInicio.getDayOfMonth()+"/"+this.dataInicio.getMonthValue()+ "/" + this.dataInicio.getYear() + " Hora de Inicio: " + this.dataInicio.getHour()+":"+this.dataInicio.getMinute() + " Hora de fim: " 
                + this.dataFim.getHour()+":"+this.dataFim.getMinute() + " Custo: " + this.Custo + " Turma: " + this.turma + " Professor: " + this.professor;
    }
}
