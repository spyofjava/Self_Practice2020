package University;

import TV.TV_Remote;

public class Obj {


    public static void main(String[] args) {

//        Academicians a = new Academicians("academicians");

//        //academicians.LogIn();

//        a.LogIn();
//        Workers w = new Workers("workers");
//        w.LogIn();
//        Officers o = new Officers("Officers");
//        o.LogIn();
//        o.eat();
//        w.eat();
//        a.eat();
        TV_Remote tv = new TV_Remote();
        tv.on();
        System.out.println(".......");
        tv.off();
        tv.channelUp();
        tv.on();
        tv.channelUp();
        tv.channelDown();
        tv.channelDown();
        tv.channelDown();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.off();
        tv.off();
        tv.on();
        tv.on();
        tv.manualChannel(222);
        tv.manualChannel(72);


    }
}
