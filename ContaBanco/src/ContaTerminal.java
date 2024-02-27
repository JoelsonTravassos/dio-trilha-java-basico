import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("______________________| Banco DIO |______________________\n");   
        System.out.print("Por gentileza, digite o número da sua conta: ");
        int numeroConta = read.nextInt();
        read.nextLine();
        System.out.print("Por gentileza, digite o número da sua agência: ");
        String agencia = read.nextLine();
        System.out.print("Por gentileza, digite o seu nome: ");
        String nomeCliente = read.nextLine();
        System.out.print("Por gentileza, digite o seu saldo: ");
        double saldo = read.nextDouble();

        System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agêcia é "
         + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
