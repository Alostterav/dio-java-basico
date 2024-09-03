package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /* analisandoCanditado(1900.0);
        analisandoCanditado(2200.0);
        analisandoCanditado(2000.0); */

        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELLA","DANIELA","JORGE"};
        int candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while ((candidatoSelecionados < 5) && (candidatosAtual < candidatos.length) ){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato: " + candidato + " Solicitou esse valor: " + salarioPretendido);
            if (salarioPretendido <= salarioBase){
                candidatoSelecionados++;
                System.out.println("O Candidato: " + candidato + " foi selecionado para a vaga!");
            }
            candidatosAtual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    /* static void analisandoCanditado(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRO-PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO");
        }
    } */
}