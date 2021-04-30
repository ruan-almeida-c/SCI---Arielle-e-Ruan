package GerarDocumento;

import java.util.regex.Pattern;

public class DocumentoFactory{
    
    private static DocumentoFactory instance;

    private DocumentoFactory() {
    }

    public static DocumentoFactory getInstance(){
        if (instance == null) {
            instance = new DocumentoFactory();
        }
        return instance;
    }
    
    public Documento CriaDocumento(String nome){
        String[] nomeArquivo = nome.split(Pattern.quote("."));
        switch(nomeArquivo[1]){
            case "pdf": 
                return new PDF();
            case "doc": 
               return new DOC();
            case "txt": 
               return new TXT();
            case "hmtl": 
               return new HTML();
            
        }
        return null;
    }
}

