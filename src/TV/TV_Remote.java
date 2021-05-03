package TV;

public class TV_Remote {
    public boolean tvRunning;



    public boolean On(){
        if (!tvRunning) {
            tvRunning = true;
        }else {
            System.out.println("Tv is already opened...");
        }
        return tvRunning;
    }
    public boolean off(){

        if (tvRunning) {
            tvRunning = false;
        }else {
            System.out.println("Tv is already closed...");
        }
        return tvRunning;
    }

    public void channelUp(){


    }
    public void channelDown(){

    }






}
