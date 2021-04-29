import java.util.Date;


public class Aulas {
    private Date data;
    private Date hInicio;
    private Date hTermino;
    private double Custo;
    private Turma turma;
    private Professor professor;
    
    
    public double CustoTotal(){
        return (this.Custo + this.professor.getValorHora());
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
    
}
