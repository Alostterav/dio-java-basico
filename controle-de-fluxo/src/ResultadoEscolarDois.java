import java.util.Scanner;

public class ResultadoEscolarDois {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.print("Digite sua nota: ");
        nota = entrada.nextInt();
        entrada.close();

        if (nota >= 7){
            System.out.println("Aprovado!");
        }

        else if (nota >= 5 && nota < 7){
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
    
}
