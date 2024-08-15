public class Operadores {
    public static void main(String[] args){
        int saldo = 200;
        int divida = 200;

        String pagarDivida = saldo >= divida ? "Você pode pagar sua divida": "Você não tem saldo suficiente";

        System.out.println(pagarDivida);
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println(simNao);

    }
}
