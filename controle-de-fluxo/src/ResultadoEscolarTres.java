import java.util.Scanner;

public class ResultadoEscolarTres {

        public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);
                int nota;
                System.out.print("Digite a nota: ");
                nota = entrada.nextInt();
                entrada.close();

                String mensagem = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

                System.out.println(mensagem);
        }
            
}