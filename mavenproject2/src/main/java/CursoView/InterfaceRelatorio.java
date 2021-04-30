package CursoView;

import CursoModel.Relatorio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfaceRelatorio {
    
    public static void main(String [] args){ 
        String inicio= "15/02/2015";
        String Fim= "15/02/2019";
        String ano= "15/02/2020";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
            Date datainicio = null;
            Date dataFim = null;
            Date dataano = null;

            try {
                datainicio = formato.parse(inicio);
                dataFim = formato.parse(inicio);
                dataano = formato.parse(inicio);
            } catch (ParseException ex) {
                Logger.getLogger(InterfaceRelatorio.class.getName()).log(Level.SEVERE, null, ex);
            }

            Relatorio novo = new Relatorio();
            novo.getMensal(datainicio, dataFim, dataano);  
    }
}
