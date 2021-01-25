package Ibrahim;

import java.util.Scanner;

public class CalculatorForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;

        while (true) {
            System.out.print("Enter number: ");
            int n1 = input.nextInt();
            System.out.print("Enter operator: ");
            String operator = input.next();
            System.out.print("Enter number: ");
            int n2 = input.nextInt();
            switch (operator) {
                case "+":
                    System.out.println("result: "+n1 + n2);
                    break;
                case "-":
                    System.out.println("result: "+(n1 - n2));
                    break;
                case "%":
                    System.out.println("result: "+n1 % n2);
                    break;
                case "/":
                    System.out.println("result: "+n1 / n2);
                    break;
                case "*":
                    System.out.println("result: "+n1 * n2);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }

    }
}
