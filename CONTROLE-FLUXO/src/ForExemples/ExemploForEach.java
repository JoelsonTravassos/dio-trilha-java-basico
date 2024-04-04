package ForExemples;

public class ExemploForEach{
    public static void main(String[] args) {
        String[] alunos = {"João", "Igor", "Lavinia", "Joelson"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}