package CursoControl;
import CursoModel.Relatorio;

public class Controlador_Relatorio {
    
    public void GerarRelatorioMensal(int mes, int ano){
        Controlador_Aulas aula = new Controlador_Aulas();
        Relatorio relatorio = new Relatorio();
        Controlador_Turma turmas = new Controlador_Turma();
        relatorio.getMensal(mes, ano, aula.consultarAulas(mes, ano), turmas.ConsultaListaTurma());
    }

    public void GerarRelatorioAnual(int ano){
        Controlador_Aulas aula = new Controlador_Aulas();
        Relatorio relatorio = new Relatorio();
        Controlador_Turma turmas = new Controlador_Turma();
        relatorio.getAnual(ano, aula.consultarAulas(ano), turmas.ConsultaListaTurma());
    }

}
