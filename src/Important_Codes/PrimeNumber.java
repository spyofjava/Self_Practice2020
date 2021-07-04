package Important_Codes;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int num ;


        int countOfDivisor ;
        for (int i = 2; i < 100; i++) {
            countOfDivisor = 0;
            for (int j = 2; j <= i/2; j++) {      // 3
                if (i%j != 0){ //bolen degilse atla
                    continue;
                }else {
                    countOfDivisor++;
                }
            }
            if (countOfDivisor == 0){
                System.out.print(i+" " );
            }
            Thread.sleep(10);

        }

    }
}
