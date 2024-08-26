import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.print("Digite sua nota: ");
        nota = entrada.nextInt();
        entrada.close();

        if (nota >= 7){
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}
