import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.Telegram;

public class Computador_main {
    public static void main(String[] args) {
        MSNMessenger messenger = new MSNMessenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();
    }
}
