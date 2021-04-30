<<<<<<< HEAD
/*
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.XSSFWorkbook;
=======
package CursoModel;

=======
package CursoModel;
import CursoModel.Aulas;
import CursoModel.Turma;
>>>>>>> a0838238d4316e667873f10f2e14f6a49774202e


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;


public class Relatorio {
    private double custo=0, VaiAcontecer=0, valor=0;
    private int i;
    public Relatorio(){
    }
    
    
    
    public void getMensal(int mes, int ano, ArrayList<Aulas> aulas, ArrayList<Turma> turmas){
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
                if(aula.getDataInicio().getMonthValue() == mes && aula.getDataInicio().getDayOfYear() == ano){
                custo = aula.CustoTotal();
                }
                if(aula.getDataInicio().getMonthValue() > mes && aula.getDataInicio().getDayOfYear() > ano){
                    VaiAcontecer = aula.getCusto();
                }
            });
            
            turmas.forEach(turma -> {
                //valor = turma.getPreco() * turma.getQntAluno();
            });
            
             HSSFRow row=   sheet.createRow((short)1);
                row.createCell(0).setCellValue(mes + "/" + ano);
                row.createCell(1).setCellValue(valor);
                row.createCell(2).setCellValue(custo);
                row.createCell(3).setCellValue(VaiAcontecer);

            FileOutputStream fileOut = new FileOutputStream(PathTillProject + "/src/ExportMensal.xls");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Seu arquivo excel foi gerado!");

        } catch ( Exception ex ) {
            System.out.println(ex);

        }
    }
    
    public void getAnual(int ano, ArrayList<Aulas> aulas, ArrayList<Turma> turmas){
        
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
            
            for(i=1; i<=12; i++){
            aulas.forEach(aula -> {
                custo = aula.CustoTotal();
                    if(/*aula.getDataInicio().getMonthValue() > i && aula.getDataInicio().getDayOfYear() > ano*/ true){
                    VaiAcontecer = aula.getCusto();
                }
            });
            
            turmas.forEach(turma -> {
                //valor = turma.getPreco() * turma.getQntAluno();
            });
             HSSFRow row=   sheet.createRow((short)i);
                //row.createCell(0).setCellValue(mes + "/" + ano);
                row.createCell(1).setCellValue(valor);
                row.createCell(2).setCellValue(custo);
                row.createCell(3).setCellValue(VaiAcontecer);
                
            }

            FileOutputStream fileOut = new FileOutputStream(PathTillProject + "/src/ExportMensal.xls");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Seu arquivo excel foi gerado!");

        } catch ( Exception ex ) {
            System.out.println(ex);

        }
    }
    
}
