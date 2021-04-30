package CursoModel;

public class Nota {
    
    private Aluno aluno;
    private float not;

    public Nota(Aluno a, float not) {
       this.aluno = a;
       this.not = not;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }


    public float getNot() {
        return not;
    }

    public void setNot(float not) {
        this.not = not;
    }

    @Override
    public String toString() {
        return this.aluno.getNome() + " " + this.not;
    }
    
}
