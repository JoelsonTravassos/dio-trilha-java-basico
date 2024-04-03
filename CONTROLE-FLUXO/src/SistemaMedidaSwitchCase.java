import java.util.Scanner;

public class SistemaMedidaSwitchCase {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma letra: ");
        String sigla = sc.nextLine();

        switch (sigla){ 
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
        sc.close();
    } 
}
