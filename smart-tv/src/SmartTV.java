/**
 * Classe que representa uma smart tv
 * @author Alostterav
 * @version 0.0.1
 * */

public class SmartTV {
    boolean statusTV = false;
    int channel = 1;
    int audioVolume = 30;

    // Ligar e Desligar a Smart TV
    public void turnON()
    {
        statusTV = true;
    }
    public void turnOFF(){
        statusTV = false;
    }

    // Aumentar e Diminuir o Audio da Smart TV
    public void increaseVolume(){
        audioVolume++;
        System.out.printf("Volume: %d\n",this.audioVolume);
    }
    public void decreaseVolume(){
        audioVolume--;
        System.out.printf("Volume: %d\n",this.audioVolume);

    }

    // Escolher o canal na Smart TV
    public void changeChannel(int chosen_channel){

        if ((chosen_channel > 200) || (chosen_channel < 0)) {
            System.out.println("Escolha um canal entre 0 e 200.");
        }
        else {
            this.channel = chosen_channel;
            System.out.printf("Canal atual: %d\n",this.channel);
        }
    }

    // Pular para MAIS ou MENOS os canais da Smart TV
    public void upperChannel(){

        if (channel > 200){
            this.channel = 0;
            System.out.printf("Canal atual: %d\n",this.channel);
        }
        else {
            this.channel++;
            System.out.printf("Canal atual: %d\n",this.channel);
        }

    }
    public void downChannel(){

        if (channel < 0){
            this.channel = 200;
            System.out.printf("Canal atual: %d\n",this.channel);
        }
        else {
            this.channel--;
            System.out.printf("Canal atual: %d\n",this.channel);
        }

    }


}
