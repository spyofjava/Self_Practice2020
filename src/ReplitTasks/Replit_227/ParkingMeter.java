package ReplitTasks.Replit_227;

public class ParkingMeter {

    public int timeLeft=0;
    public int maxTime=0;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }

    public boolean add(int a){
        if (timeLeft<maxTime) {
            if (a == 25) {
                timeLeft += 30;
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

    public void  tick(){
        if (timeLeft>0) {
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if (timeLeft==0){
            return true;
        }else {
            return false;
        }
    }
}
