package Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        calculator(scanner.nextInt(), scanner.next().charAt(0), scanner.nextInt());

    }

    public static void calculator(int num1,char operator,int num2){

        boolean isvalid = operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%';
        if (isvalid){
            switch (operator){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println((num1-num2));
                    break;
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                default:
                    System.out.println(num1%num2);
                    break;
            }
        }else {
            System.out.println("Invalid Operator");
        }




    }




}
