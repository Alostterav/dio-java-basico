package apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectando com a Internet");
    }

    // Código que foi herdado anteriormente.

    /* public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println(" Enviando Mensagem!");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem!");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado com a internet!");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da mensagem");
    }
        */
}
