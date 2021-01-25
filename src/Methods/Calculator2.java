package Methods;

import Ibrahim.SalaryCalculator;
import Ibrahim.SwitchCase;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        double a= input.nextDouble();
        String  operators =input.next();
        double b= input.nextDouble();


        if (operators.equals("+")){
            System.out.println(toplama(a,b));
        }else if (operators.equals("-")){
            System.out.println(cikarma(a,b));
        }else if (operators.equals("*")){
            System.out.println(carpma(a,b));
        }else if (operators.equals("/")){
            System.out.println(bolme(a,b));
        }else if (operators.equals("%")){
            System.out.println(remainder(a,b));
        }

        System.out.println();




    }


    public static double toplama(double a,double b){
        return (a+b);
    }
    public static double cikarma(double a,double b){
       return (a-b);
    }
    public static double carpma(double a,double b){
       return (a*b);
    }

    public static double bolme(double a,double b){
      return (a/b);
    }

    public static double remainder(double a,double b){
      return (a%b);
    }




}
