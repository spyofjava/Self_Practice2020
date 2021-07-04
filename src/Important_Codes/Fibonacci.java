package Important_Codes;

public class Fibonacci {

    public static void main(String[] args) throws InterruptedException {



        int a = 1;
        int b = 1;
        int c = 1;

        System.out.print(a+" "+b);//   0  1  2  3  4  5    a =1
        for (int i = 0; i < 50; i++) {   //1  1  2 1+2              b =1
            //a  b  c  c
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;

            Thread.sleep(500);




        }












        /*
        Write a simple Java program which will print Fibonacci series,
        e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions
         like using iteration over recursion and how to optimize the solution using caching and memoization.
    */
        // 1 2 3 4 5 6 7  8  9  10
        // 1 1 2 3 5 8 13 21 34 55






    }
}
