package ReplitTasks.Replit_228;

public class GasTank {

    public double amount=0;
    public double capacity;


    public GasTank(double capacity){
        this.capacity=capacity;
    }



    public void addGas(double amount){
        this.amount+=amount;
        if (this.amount>capacity){
            this.amount=capacity;
        }
    }



    public void useGas(double amount){
        this.amount-=amount;
        if (this.amount<0) {
            this.amount = 0;
        }

    }



    public boolean isEmpty(){
        if (amount<0.1){
            return true;
        }else {
            return false;
        }
    }



    public boolean isFull(){
        if (amount>(capacity-0.1)){
            return true;
        }else {
            return false;
        }
    }


    public double getGasLevel(){
        return this.amount;
    }

    public double fillUpp(){
        return (capacity-amount);
    }

}
