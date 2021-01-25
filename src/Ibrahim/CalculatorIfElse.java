package Ibrahim;

import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1= input.nextInt();

        System.out.println("Enter an operator: ");
        char operator=input.next().charAt(0);

        System.out.println("Enter a number: ");
        int n2= input.nextInt();

        boolean result=operator=='*'||operator=='/'||operator=='%'||operator=='+'||operator=='-';

        if(result){

            if (operator=='*'){
                System.out.println(n1*n2);
            }else if (operator=='/'){
                System.out.println(n1/n2);
            }else if (operator=='%'){
                System.out.println(n1%n2);
            }else if (operator=='+'){
                System.out.println(n1+n2);
            }else if (operator=='-'){
                System.out.println((n1-n2));
            }





        }else {
            System.out.println("Invalid operator");
        }



    }

}
