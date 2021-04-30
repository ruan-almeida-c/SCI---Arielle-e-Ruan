/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerarDocumento;

/**
 *
 * @author ruan_
 */
public abstract class Documento {
    public abstract void CriaDocumento();
    
    public String ExibeMensagem(){
        return "Bem vindo ao Criador de Documento";
    }
}
