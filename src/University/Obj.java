package University;

import TV.TV_Remote;

public class Obj {


    public static void main(String[] args) {

        Academicians a = new Academicians("academicians");

        //academicians.LogIn();

        a.LogIn();
        Workers w = new Workers("workers");
        w.LogIn();
        Officers o = new Officers("Officers");
        o.LogIn();
        o.eat();
        w.eat();
        a.eat();
        TV_Remote tv = new TV_Remote();
        System.out.println(tv.tvRunning);

    }
}
