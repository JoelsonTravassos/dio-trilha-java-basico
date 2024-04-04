package ForExemples;

public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays os indices iniciam no zero
        String[] alunos = {"João", "Igor", "Lavinia", "Joelson"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);
        }
    }
}
