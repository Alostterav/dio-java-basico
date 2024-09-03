
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormMatricula {
    public static void main(String[] args) throws Exception {
        String nomeCompleto;
        long cpf,rg;
        int idade;

        Scanner scanner = new Scanner(System.in);

        try { 
        System.out.print("NOME COMPLETO: ");
        nomeCompleto = scanner.nextLine();

        System.out.print("CPF: ");
        cpf = scanner.nextLong();

        System.out.print("RG: ");
        rg = scanner.nextLong();

        System.out.print("IDADE: ");
        idade = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("-- Reveja os campos CPF, RG ou IDADE, por favor --");
        }
        scanner.close();

    }
}
