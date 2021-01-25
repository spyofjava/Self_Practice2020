package ReplitTasks;

public class PrimeNumber {

    public static void main(String[] args) throws InterruptedException {
        int num=21;
        Prime(num);
    }

    public static void Prime(int number)  {
        int repeat=0;
        for (int i=2;i<number/2;i++){
            if (number%i==0){
                repeat++;

            }
        }
        if (repeat==0){
            System.out.println("prime number.");
            System.out.println(repeat);
        }


    }

}
