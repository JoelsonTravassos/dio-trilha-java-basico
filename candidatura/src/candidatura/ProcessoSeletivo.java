package candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    private static ArrayList<String> candidatosSelecionados = new ArrayList<>();
    private static final int QUANTIDADE_DE_VAGAS = 5;
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimindoCandidatosSelecionados();

        System.out.println("\nEntrando em contato com os candidatos:");
        for(String candidato : candidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");    

        }while(continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa\n");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas " + tentativasRealizadas + " realizada\n");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalCandidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        while(totalCandidatosSelecionados < QUANTIDADE_DE_VAGAS && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados.add(candidato);
                System.out.println("Candidato " + candidato + " foi selecionado.\n");
                totalCandidatosSelecionados++;
            }else {
                System.out.println("Candidato " + candidato + " não foi selecionado\n");
            }
            candidatoAtual++;
        }
    }

    static void imprimindoCandidatosSelecionados(){
        System.out.println("\nCandidatos selecionados:");
        for(int i=0; i < candidatosSelecionados.size(); i++){
            System.out.println("O candidato de número: " + (i + 1) + " é " + candidatosSelecionados.get(i));
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato, com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
