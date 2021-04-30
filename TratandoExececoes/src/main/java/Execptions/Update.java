/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execptions;

import java.io.IOException;
import jdk.nashorn.internal.runtime.ParserException;

/**
 *
 * @author ruan_
 */
public class Update {
    
    protected String update(Fonte src){
        try{
            src.openConnection();
        }catch (IOException e){
            throw null;
        }
        Parser p = new Parser(src);
        return p.parse();
    }
    
    public void updateNews(){
        
        for (Fonte src : fontes){
            try{    
                String str = update(src);
                news.add(str);
            } catch(ParserException p){
                news.add(p);
            }finally{
                continue;
            }
        
        }
}
}
