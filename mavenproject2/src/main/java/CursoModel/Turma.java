package CursoModel;

import java.time.LocalDateTime;
public class Turma {
	private String id;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private String lingua;
	private String nivel;
	private double preco;
	private Aluno aluno;
	//FALTA LISTA DOS ALUNOS
	
	public Turma(String id, int anoInicio, int mesInicio, int diaInicio, int horaInicio,
			int minInicio, int anoFim, int mesFim, int diaFim, int horaFim,
			int minFim, String lingua, String nivel, double preco) {
		this.id = id;
		this.dataInicio = LocalDateTime.of(anoInicio, mesInicio, diaInicio, horaInicio, minInicio);
		this.dataFim = LocalDateTime.of(anoFim, mesFim, diaFim, horaFim, minFim);
		this.lingua = lingua;
		this.nivel = nivel;
		this.preco = preco;
	}
	
	 public Aluno getAluno() {
		return aluno;
	}
	 public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
	
	public void getQntAluno() {
		//calcula qtd de alunos na turma
	}
	public void setNota() {
		//insere a nota do aluno na turma
	}
	public void getListaAlunos() {
		//retorna a lista de alunos da turma
	}
}
