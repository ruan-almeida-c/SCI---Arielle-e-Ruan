package CursoModel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class Relatorio {
    private Date inicio, fim, ano;
    public void getMensal(Date inicio, Date fim, Date ano){

        XSSFWorkbook planilha = new XSSFWorkbook();
        String PathTillProject = System.getProperty("user.dir");

        try {
            FileOutputStream fileOut = new FileOutputStream(PathTillProject + "/src/Export.xls");
        } catch (FileNotFoundException ex) {
            System.out.println("erro: " + ex);
        }
        
        XSSFSheet Principal = planilha.createSheet("Relatório");

        
        XSSFRow row;
        int count = 0;
        String posicaoExcel = null;

        row = Principal.createRow(count);
        
        Cell cellSer1 = row.createCell(0);
        String myCellSer1 = "Nota Fiscal";
        String stringCellValueSer1 = myCellSer1;
        cellSer1.setCellValue(stringCellValueSer1);

        Cell cellnf1 = row.createCell(1);
        String myCell1 = "Série";
        String stringCellValue1 = myCell1;
        cellnf1.setCellValue(stringCellValue1);
        

    }
    
    public void getAnual(Date anoInicio, Date anoFim){
        //Biblioteca de gerar xls
    }
    
}
