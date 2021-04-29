import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.XSSFWorkbook;


import java.util.Date;


public class Relatorio {
    private Date inicio, fim, ano;
    XSSFWorkbook planilha = new XSSFWorkbook();
    String PathTillProject = System.getProperty("user.dir");
    FileOutputStream fileOut = new FileOutputStream(PathTillProject + "/src");
    
    
    public void getMensal(Date inicio, Date fim, Date ano){
        //Biblioteca de gerar xls
    }
    
    public void getAnual(Date anoInicio, Date anoFim){
        //Biblioteca de gerar xls
    }
    
}
