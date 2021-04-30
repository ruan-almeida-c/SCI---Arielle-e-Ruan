/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerarDocumento;
import java.util.regex.Pattern;


/**
 *
 * @author ruan_
 */
public class Main {
     public static void main(String[] args){
        DocumentoFactory factory = DocumentoFactory.getInstance();
        Documento obj = factory.CriaDocumento("tfffuygyu.txt");
        obj.CriaDocumento();
     }
}
