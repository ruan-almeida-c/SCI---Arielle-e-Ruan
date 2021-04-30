package CursoModel;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Turma {
    private String id;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String lingua;
    private String nivel;
    private double preco;
    private final ArrayList<Nota> listaAlunoNotas;

    public Turma(String id, int anoInicio, int mesInicio, int diaInicio, int horaInicio,
                    int minInicio, int anoFim, int mesFim, int diaFim, int horaFim,
                    int minFim, String lingua, String nivel, double preco) {
        this.listaAlunoNotas = new ArrayList();
        this.id = id;
        this.dataInicio = LocalDateTime.of(anoInicio, mesInicio, diaInicio, horaInicio, minInicio);
        this.dataFim = LocalDateTime.of(anoFim, mesFim, diaFim, horaFim, minFim);
        this.lingua = lingua;
        this.nivel = nivel;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return this.id + " " + this.dataInicio +" "+ this.dataFim +" "+
                this.lingua + " "+ this.nivel + " "+ this.preco;
    }


    public LocalDateTime getDataFim() {
           return dataFim;
   }
   public void setDataFim(LocalDateTime dataFim) {
           this.dataFim = dataFim;
   }
   public LocalDateTime getDataInicio() {
           return dataInicio;
   }
   public void setDataInicio(LocalDateTime dataInicio) {
           this.dataInicio = dataInicio;
   }
   public String getId() {
           return id;
   }
   public void setId(String id) {
           this.id = id;
   }
   public String getLingua() {
           return lingua;
   }
   public void setLingua(String lingua) {
           this.lingua = lingua;
   }
   public String getNivel() {
           return nivel;
   }
   public void setNivel(String nivel) {
           this.nivel = nivel;
   }
   public double getPreco() {
           return preco;
   }
   public void setPreco(double preco) {
           this.preco = preco;
   }

   public void insereAlunoTurma(Aluno a){
       Nota n = new Nota(a, 0);
       listaAlunoNotas.add(n);
   }

   public int getQntAluno() {
           return this.listaAlunoNotas.size();
   }
   public void setNota(String matricula, float nota) {//insere a nota do aluno na turma
       for(int i=0;i<listaAlunoNotas.size();i++){
           if(listaAlunoNotas.get(i).getAluno().getMatricula().equals(matricula)){
               listaAlunoNotas.get(i).setNot(nota);
           }
       }   

   }
   public void getListaAlunos() {//retorna a lista de alunos da turma
       for(int i=0;i<listaAlunoNotas.size();i++){
           System.out.println(listaAlunoNotas.get(i).getAluno().getNome());
       }
   }

    public ArrayList<Nota> getListaAlunoNotas() {
        return listaAlunoNotas;
    }
        

    
}
