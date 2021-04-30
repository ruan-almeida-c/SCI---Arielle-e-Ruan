<<<<<<< HEAD
/*
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.XSSFWorkbook;
=======
package CursoModel;
>>>>>>> e98750504c81b5bc03b477d20374cd93aaf95418

import CursoControl.Controlador_Aulas;
import CursoModel.Turma;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;


public class Relatorio {
    public void getMensal(int mes, int ano, ArrayList<Aulas> aulas){
        int cont=0;
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
                HSSFRow row=   sheet.createRow((short)1);
                row.createCell(0).setCellValue(aula.getDataInicio());
                row.createCell(1).setCellValue(aula.getTurma().getPreco() * sizof(aula.getTurma().getListaAlunos()));
                row.createCell(1).setCellValue(fim);
                row.createCell(1).setCellValue(fim);
  
        });
            

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
*/