import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("numero da conta (dddd): ");
        numeroConta = entrada.nextInt();

        System.out.println("numero da agencia (ddd-d): ");
        agencia = entrada.next();

        System.out.println("nome do cliente: ");
        nomeCliente = entrada.next();

        System.out.println("saldo: ");
        saldo = entrada.nextDouble();

        String mensagem = String.format("Nome: %s\n Saldo: %.2f\n Numero da Conta: %d\n Agência: %s",
        nomeCliente,saldo,
        numeroConta,agencia);
        
        entrada.close();

        System.out.print(mensagem);


        
    }
}
