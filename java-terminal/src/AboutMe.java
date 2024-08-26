
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String sobrenome;
        int idade;
        double altura;

        System.out.println("Diga seu nome: ");
        nome = scanner.next();

        System.out.println("Diga seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Diga idade: ");
        idade = scanner.nextInt();

        System.out.println("Diga sua altura: ");
        altura = scanner.nextDouble();

        scanner.close();

        System.out.println("nome: "+nome+" "+sobrenome);
        System.out.println("idade: "+idade);
        System.out.println("altura: "+altura);
    }
}
