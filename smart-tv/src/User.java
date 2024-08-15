public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smart_tv = new SmartTV();

        System.out.println(smart_tv.statusTV);
        System.out.println(smart_tv.channel);
        System.out.println(smart_tv.audioVolume);

        smart_tv.turnON();

        System.out.println(smart_tv.statusTV);

        smart_tv.increaseVolume();
        smart_tv.increaseVolume();

        smart_tv.decreaseVolume();


        smart_tv.changeChannel(99);
        smart_tv.changeChannel(201);

        smart_tv.upperChannel();
        smart_tv.upperChannel();
        smart_tv.downChannel();


    }
}
