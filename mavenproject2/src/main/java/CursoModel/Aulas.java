package CursoModel;

import java.util.Date;


public class Aulas {
    private final char Id;
    private Date data;
    private Date hInicio;
    private Date hTermino;
    private double Custo;
    private Turma turma;
    private Professor professor;

    public Aulas(char Id, Professor professor) {
        this.professor = professor;
        this.Id = Id;
    }
    
    public double CustoTotal(){
        return (this.Custo + this.professor.getValorHora());
    }
    public char getId(){
        return this.Id;
    }
    public Date getData(){
        return this.data;
    }
    public Date getHInicio(){
        return this.hInicio;
    }
    public Date  getHTermino(){
        return this.hTermino;
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
    public void setData(Date data){
        this.data = data;
    }
    public void setHInicio(Date hInicio){
        this.hInicio = hInicio;
    }
    public void  setHTermino(Date hTermino){
        this.hTermino = hTermino;
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
        return "Id: " + this.Id + " data: " + this.data + " Hora de Inicio: " + this.hInicio + " Hora de fim: " 
                + this.hTermino + " Custo: " + this.Custo + " Turma: " + this.turma + " Professor: " + this.professor;
    }
}
