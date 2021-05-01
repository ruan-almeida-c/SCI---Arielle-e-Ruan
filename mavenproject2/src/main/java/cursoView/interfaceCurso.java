package cursoView;
import CursoControl.Controlador_Aulas;
import CursoControl.Controlador_Relatorio;
import CursoControl.Controlador_Usuarios;
import CursoControl.Controlador_Turma;
import java.time.LocalDateTime;
import java.util.Scanner;

public class interfaceCurso {
    private final Controlador_Usuarios ctlUsuario;
    private final Controlador_Turma ctlTurma;
    private final Controlador_Relatorio ctlRelatorio;
    private final Controlador_Aulas ctlAulas;

    public interfaceCurso() {
        this.ctlUsuario =  new Controlador_Usuarios();
        this.ctlTurma = new Controlador_Turma();
        this.ctlRelatorio = new Controlador_Relatorio();
        this.ctlAulas = new Controlador_Aulas();
    }
    
    
    
    public static void main(String[] args) {
        interfaceCurso inter = new interfaceCurso();
        inter.menu();
    }
    
    public void menu(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        do{
        
            System.out.println("SISTEMA CURSO LINGUAS");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Turma");
            System.out.println("4 - Alterar Dados Aluno");
            System.out.println("5 - Alterar Dados Professor");
            System.out.println("6 - Alterar Dados Turma");
            System.out.println("7 - Inserir Aluno Turma");
            System.out.println("8 - Excluir Aluno");
            System.out.println("9 - Excluir Professor");
            System.out.println("10 - Excluir Turma");
            System.out.println("11 - Inserir Nota Aluno");
            System.out.println("12 - Consultar Dados");
            System.out.println("13 - Sair");
           
             
            opcao = sc.nextInt();
            switch(opcao){
                case 1:cadastrarAluno();
                    break;
                case 2:cadastrarProfessor();
                   break;
                case 3:cadastrarTurma();
                   break;
                case 4:alterarAluno();
                    break;
                case 5:alterarProfessor();
                    break;
                case 6:alterarTurma();
                    break;
                case 7:inserirAlunoTurma();
                    break;
                case 8:excluirAluno();
                    break;
                case 9:excluirProfessor();
                    break;
                case 10:excluirTurma();
                    break;
                case 11:inserirNotaAlunoTurma();
                    break;
                case 12:consultarDados();
                    break;
                
            }
        }while(opcao != 13);
    }
    
    public void cadastrarAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno(a): " );
        String nomeAluno = sc.next();
        
        System.out.print("Digite a matrícula do Aluno(a): " );
        String matAluno = sc.next();
          
        System.out.print("Digite o endereco do Aluno(a): ");
        String endAluno = sc.next();
          
        System.out.print("Digite o telefone do Aluno(a): " );
        String telAluno = sc.next();
       
        
        System.out.print("Digite o email do Aluno(a): " );
        String eAluno = sc.next();
        
        System.out.print("Digite o código do Aluno(a): " );
        int codAluno = sc.nextInt();
        
        ctlUsuario.CadastroAluno(nomeAluno, matAluno, endAluno, telAluno, eAluno, codAluno);
        
    }
    
    public void cadastrarProfessor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Professor(a): " );
        String nomeProf = sc.next();
        
        System.out.print("Digite a matrícula do Professor(a): " );
        String matProf = sc.next();
        
          
        System.out.print("Digite o endereco do Professor(a): ");
        String endProf = sc.next();
          
        System.out.print("Digite o telefone do Professor(a): " );
        String telProf = sc.next();
        
        System.out.print("Digite o valor/hora do Professor(a): " );
        double valHora = sc.nextDouble();
        
        System.out.print("Digite o código do idioma: INGLES(1), ESPANHOL(2), FRANCES(3), INGLES_ESPANHOL(4), \n" +
"        INGLES_FRANCES(5),ESPANHOL_FRANCES(6), TODAS(7) " );
        int linLec = sc.nextInt();
        
        ctlUsuario.CadastroProfessor(nomeProf, matProf, endProf, telProf, valHora, linLec);
        
    }
    
    public void cadastrarTurma(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ID da Turma: " );
        String ident = sc.next();
        
        System.out.print("Digite o ano de Inicio da Turma: " );
        int anoIn = sc.nextInt();
          
        System.out.print("Digite o mês de Inicio da Turma: ");
        int mesIn = sc.nextInt();
        
        System.out.print("Digite o dia de Inicio da Turma: ");
        int diaIn = sc.nextInt();
        
        System.out.print("Digite a hora de Inicio da Turma: ");
        int horaIn = sc.nextInt();
        
        System.out.print("Digite o minuto de Inicio da Turma: ");
        int minIn = sc.nextInt();
        
        System.out.print("Digite o ano do Fim da Turma: " );
        int anoFim = sc.nextInt();
          
        System.out.print("Digite o mês do Fim da Turma: ");
        int mesFim = sc.nextInt();
        
        System.out.print("Digite o dia do Fim da Turma: ");
        int diaFim = sc.nextInt();
        
        System.out.print("Digite a hora do Fim da Turma: ");
        int horaFim = sc.nextInt();
        
        System.out.print("Digite o minuto de Fim da Turma: ");
        int minFim = sc.nextInt();
        
        System.out.print("Digite o Idioma da Turma: " );
        String lingua = sc.next();
        
        System.out.print("Digite o nível da Turma: (basico, intermediario ou avancado) " );
        String nivel = sc.next();
        
        System.out.print("Digite o preço da Turma: " );
        double preco = sc.nextDouble();
        
        ctlTurma.cadastrarTurma(ident, anoIn, mesIn, diaIn, horaIn, minIn, anoFim, 
                mesFim, diaFim, horaFim, minFim, lingua, nivel, preco);
    }
    
    public void alterarAluno(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para o que deseja alterar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Matricula");
        System.out.println("3 - Endereco");
        System.out.println("4 - Telefone");
        System.out.println("5 - Email");
        System.out.println("6 - Codigo");
        
        opcao = sc.nextInt();
        
        System.out.print("Digite a matrícula do Aluno(a) que deseja alterar: " );
        String matAluno = sc.next();
        
        System.out.print("Digite a nova informaçao para preenchimento (ex: se escolheu a opçao 1, digite Maria): " );
        String campo = sc.next();
        
        ctlUsuario.alterarCadastroAluno(opcao, matAluno, campo);
    }
    
    public void alterarProfessor(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para o que deseja alterar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Matricula");
        System.out.println("3 - Endereco");
        System.out.println("4 - Telefone");
        System.out.println("5 - Valor/Hora");
        System.out.println("6 - Idiomas");
        
        opcao = sc.nextInt();
        
        System.out.print("Digite a matrícula do Professor(a) que deseja alterar: " );
        String matProf = sc.next();
        
        System.out.print("Digite a nova informaçao para preenchimento (ex: se escolheu a opçao 1, digite José): " );
        String campo = sc.next();
        
        ctlUsuario.alterarCadastroProfessor(opcao, matProf, campo);
    }
    
    public void alterarTurma(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para o que deseja alterar:");
        System.out.println("1 - ID");
        System.out.println("2 - Idioma");
        System.out.println("3 - Nivel");
        System.out.println("4 - Preco");
        System.out.println("5 - Data Inicio");
        System.out.println("6 - Data Fim");
        
        opcao = sc.nextInt();
        
        if(opcao == 1 || opcao == 2 || opcao == 3 ||opcao == 4){
            System.out.print("Digite o ID da Turma que deseja alterar: " );
            String idTurma = sc.next();

            System.out.print("Digite a nova informaçao para preenchimento (ex: se escolheu a opçao 1, digite 12): " );
            String campo = sc.next();

            ctlTurma.alterarTurma(opcao, idTurma, campo);
        }
        if(opcao == 5){
            System.out.print("Digite o ID da Turma que deseja alterar: " );
            String idTurma = sc.next();
            
            System.out.print("Digite o ano de Inicio da Turma: " );
            int anoIn = sc.nextInt();
          
            System.out.print("Digite o mês de Inicio da Turma: ");
            int mesIn = sc.nextInt();

            System.out.print("Digite o dia de Inicio da Turma: ");
            int diaIn = sc.nextInt();

            System.out.print("Digite a hora de Inicio da Turma: ");
            int horaIn = sc.nextInt();

            System.out.print("Digite o minuto de Inicio da Turma: ");
            int minIn = sc.nextInt();
            
            ctlTurma.alterarTurmaData(1, LocalDateTime.of(anoIn, mesIn, diaIn, horaIn, minIn), idTurma);

        }
        if(opcao == 6){
            System.out.print("Digite o ID da Turma que deseja alterar: " );
            String idTurma = sc.next();
            
            System.out.print("Digite o ano de Inicio da Turma: " );
            int anoFim = sc.nextInt();
          
            System.out.print("Digite o mês de Inicio da Turma: ");
            int mesFim = sc.nextInt();

            System.out.print("Digite o dia de Inicio da Turma: ");
            int diaFim = sc.nextInt();

            System.out.print("Digite a hora de Inicio da Turma: ");
            int horaFim = sc.nextInt();

            System.out.print("Digite o minuto de Inicio da Turma: ");
            int minFim = sc.nextInt();
            
            ctlTurma.alterarTurmaData(2, LocalDateTime.of(anoFim, mesFim, diaFim, horaFim, minFim), idTurma);
        }
    }
    
    public void inserirAlunoTurma(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ID da Turma do Aluno: " );
        String idTurma = sc.next();
        
        System.out.print("Digite a matrícula do(a) Aluno(a) a ser inserido(a) na Turma: " );
        String matAluno = sc.next();
        
        ctlTurma.insereAlunoTurma(matAluno, idTurma);
    }
    
    public void excluirAluno(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a matrícula do(a) Aluno(a) a ser removido(a) do sistema: " );
        String matAluno = sc.next();
        
        ctlUsuario.removerAluno(matAluno);
    }
    
    public void excluirProfessor(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a matrícula do(a) Professor(a) a ser removido(a) do sistema: " );
        String matProf = sc.next();
        
        ctlUsuario.removerProfessor(matProf);
    }
    
    public void excluirTurma(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ID da Turma a ser excluída: " );
        String idTurma = sc.next();
        
        ctlTurma.removerTurma(idTurma);
    }
    
    public void inserirNotaAlunoTurma(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ID da Turma do Aluno: " );
        String idTurma = sc.next();
        
        System.out.print("Digite a matrícula do Aluno: " );
        String matAluno = sc.next();
        
        System.out.print("Digite a nota do Aluno: " );
        float nota = sc.nextFloat();
        
        ctlTurma.RegistrarNotaAluno(idTurma, matAluno, nota);
    }
    
    public void consultarDados(){
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para o que deseja consultar: ");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Turma");
        System.out.println("4 - Aula");
        System.out.println("5 - Nota Aluno");
        
        
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Digite a matrícula do Aluno(a): " );
                String matAluno = sc.next();
                ctlUsuario.ConsultaAluno(matAluno);
                break;
            case 2:
                System.out.print("Digite a matrícula do Professor(a): " );
                String matProf = sc.next();
                ctlUsuario.ConsultaProfessor(matProf);
                break;
            case 3:
                System.out.print("Digite o ID da Turma: " );
                String ident = sc.next();
                ctlTurma.consultarTurma(ident);
                break;
            case 4:
                /*System.out.print("Digite o ID da Aula: " );
                char idAula = sc.nextChar();
                ctlAulas.consultarAulas(idAula);*/
                break;
            case 5:
                System.out.print("Digite a matrícula do Aluno(a): " );
                String matAl = sc.next();
                System.out.print("Digite o ID da Turma: " );
                String idT = sc.next();
                ctlTurma.exibirNotaAluno(matAl, idT);
                break;
        }
    }
    
}
