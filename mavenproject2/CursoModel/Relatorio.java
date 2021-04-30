import CursoModel.Aulas;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;


public class Relatorio {
    public double custo=0, VaiAcontecer=0;
    public void getMensal(int mes, int ano, ArrayList<Aulas> aulas){
        
        GregorianCalendar gc =new GregorianCalendar();
        try{
            
            // local do arquivo
            String PathTillProject = System.getProperty("user.dir");
            HSSFWorkbook workbook=new HSSFWorkbook();
            HSSFSheet sheet =  workbook.createSheet("Relatorio Mensal");  
            
            // criando as Colunas
            HSSFRow rowhead = sheet.createRow((short)0);
            rowhead.createCell(0).setCellValue("Data");
            rowhead.createCell(1).setCellValue("Valor arrecadado nas Turmas");
            rowhead.createCell(2).setCellValue("gasto já acontecido");
            rowhead.createCell(3).setCellValue("gasto ainda a acontecer");
            
            // definindo os valores das linhas
            aulas.forEach(aula -> {
                custo = aula.CustoTotal();
                if(aula.getDataInicio().getMonthValue() > mes && aula.getDataInicio().getDayOfYear() > ano){
                    VaiAcontecer = aula.getCusto();
                }
        });
             HSSFRow row=   sheet.createRow((short)1);
                row.createCell(0).setCellValue(mes + "/" + ano);
                row.createCell(2).setCellValue(custo);
                row.createCell(3).setCellValue(VaiAcontecer);

            FileOutputStream fileOut = new FileOutputStream(PathTillProject + "/src/Export.xls");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Seu arquivo excel foi gerado!");

        } catch ( Exception ex ) {
            System.out.println(ex);

        }
    }
    
    public void getAnual(Date anoInicio, Date anoFim){
    }
    
}
