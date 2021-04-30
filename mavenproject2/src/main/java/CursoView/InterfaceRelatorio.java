package CursoView;

import CursoControl.Controlador_Relatorio;

public class InterfaceRelatorio {
    
    public static void main(String [] args){ 
            Controlador_Relatorio novo = new Controlador_Relatorio();
            novo.GerarRelatorioMensal(05, 2020);  
    }
}
