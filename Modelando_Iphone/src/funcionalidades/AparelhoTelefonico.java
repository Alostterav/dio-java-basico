package funcionalidades;

import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {

    Scanner sc = new Scanner(System.in);

    public void ligar(String numero){
        String numeroLigando = formatarNumeroTelefone(numero);
        Random random = new Random();

        int verificador_atendeu = 0;

        for(int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(11);
            System.out.printf("Ligando para %s ...\n",numeroLigando);

            if(numeroAleatorio % 2 == 0){
                System.out.println("Atendeu");
                verificador_atendeu = 1;
                break;
            }
        }
        if(verificador_atendeu == 0){
            System.out.println("Ligação perdida!");
        }


    }

    public void atender(String numero){
        for(int i = 0; i < 5; i++){
            System.out.println("Chamada recebida de "+ formatarNumeroTelefone(numero));
            System.out.println("Deseja atender? S/N");
            char resposta = sc.nextLine().charAt(0);
            if(resposta == 's'){
                System.out.println("Chamada atendida!");
                break;
            }
            else if(resposta == 'n'){
                System.out.println("Chamada recusada");
                break;
            }
        }
        System.out.println("Processo terminado.");
    };

    public void iniciarCorreioVoz(String numero){
        System.out.printf("Iniciando Correio Voz com %s...", formatarNumeroTelefone(numero));

        while(true){
            System.out.print("Terminar correio de voz? S/N: ");
            char resposta = sc.nextLine().charAt(0);
            if(resposta == 's'){
                break;
            }
        }
    };

    private String formatarNumeroTelefone(String numero){

        // Verifica se o número tem 11 dígitos (formato com DDD e 9 dígitos)
        if (numero.length() == 11) {
            return numero.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        }
        // Verifica se o número tem 10 dígitos (formato com DDD e 8 dígitos)
        else if (numero.length() == 10) {
            return numero.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
        }
        // Retorna o número sem formatação se não tiver 10 ou 11 dígitos
        else {
            return numero;
        }


    }
}
