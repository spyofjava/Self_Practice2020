package ReplitTasks.Replit_225_TvRemote;

public class Main {


    public static void main(String[] args) {

        TV tv = new TV();


        System.out.println(tv.isOn());//closed
        System.out.println(tv.on);//closed
        tv.turnOff();//TV is already OFF
        System.out.println(tv.isOn());//closed
        tv.turnOn();//opened
        System.out.println(tv.isOn());//opened

        System.out.println(tv.channel);

        tv.setVolumeLevel(7);
        System.out.println(tv.getVolumeLevel());
        tv.setVolumeLevel(8);
        System.out.println(tv.getVolumeLevel());



    }

}
