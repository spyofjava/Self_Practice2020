package TV;

import java.awt.*;
import java.util.Collections;

public class TV_Remote {
    public boolean Running;
    public int channelNum = 0;
    public static final String ANSI_RESET = "\u001B[0m";
   // public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
   // public static final String ANSI_GREEN = "\u001B[32m";
   // public static final String ANSI_YELLOW = "\u001B[33m";
   // public static final String ANSI_BLUE = "\u001B[34m";
   // public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
  //  public static final String ANSI_WHITE = "\u001B[37m";


    public void on() {
        if (!Running) {
            Running = true;
            System.out.println("Tv is "+ANSI_CYAN+"ON"+ANSI_RESET);
        } else {
            System.out.println("Tv is already "+ANSI_CYAN+"OPENED"+ANSI_RESET+"...");
        }

    }

    public void off() {

        if (Running) {
            Running = false;
            System.out.println("Tv is "+ANSI_RED+"OFF"+ANSI_RESET);
        } else {
            System.out.println("Tv is already "+ANSI_RED+"CLOSED"+ANSI_RESET+"...");
        }
    }

    public void channelUp() {

        if (Running) {
            if (channelNum <=98) {
                channelNum++;
                System.out.println("Channel "+channelNum);
            } else {
                channelNum = 0;
                System.out.println("Channel "+channelNum);
            }

        } else {
            System.out.println("Tv is "+ANSI_RED+"CLOSED"+ANSI_RESET+"...");
        }
    }



    public void channelDown() {
        if (Running) {
            if (channelNum > 0) {
                channelNum--;
                System.out.println("Channel "+channelNum);
            } else {
                channelNum = 99;
                System.out.println("Channel "+channelNum);
            }
        } else {
            System.out.println("Tv is "+ANSI_RED+"CLOSED"+ANSI_RESET+"...");
        }
    }

    public void manualChannel(int num) {
        if (Running) {
            if (num >= 100 || num < 0) {
                System.out.println(ANSI_RED+"Invalid channel"+ANSI_RESET+"...");
            } else {
                channelNum = num;
                System.out.println("Channel "+channelNum);
            }
        } else {
            System.out.println("Tv is "+ANSI_RED+"CLOSED"+ANSI_RESET+"...");
        }
    }

}
