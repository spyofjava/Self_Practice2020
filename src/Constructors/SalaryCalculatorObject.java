package Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryCalculatorObject {

    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(40, 55, 9, 22);

        SalaryCalculator salary2 = new SalaryCalculator(40, 55, 0, 23);

        SalaryCalculator salary3 = new SalaryCalculator(45, 35, 8, 21);

        SalaryCalculator salary4 = new SalaryCalculator(45, 65, 8, 24);

        SalaryCalculator salary5 = new SalaryCalculator(50, 70, 9, 22);

        System.out.println(salary1);
        System.out.println("==============");
        System.out.println(salary2);
        System.out.println("==============");
        System.out.println(salary3);
        System.out.println("==============");
        System.out.println(salary4);
        System.out.println("==============");
        System.out.println(salary5);
        System.out.println("==============");


        ArrayList<SalaryCalculator> list=new ArrayList<>(Arrays.asList(salary1,salary2,salary3,salary4,salary5));

        double minTotalTax=list.get(0).totalTax;
        double maxTotalTax=list.get(0).totalTax;
        for (SalaryCalculator each:list){
            if (each.totalTax>maxTotalTax){
                maxTotalTax= each.totalTax;
            }
            if (each.totalTax<minTotalTax){
                minTotalTax= each.totalTax;
            }
        }

        System.out.println("Max  total tax: "+maxTotalTax);
        System.out.println("Min  total tax: "+minTotalTax);

        double minSalaryAfterTax=list.get(0).salaryAfterTax;
        double maxSalaryAfterTax=list.get(0).salaryAfterTax;
        for (SalaryCalculator each:list){
            if (each.salaryAfterTax>maxSalaryAfterTax){
                maxSalaryAfterTax= each.salaryAfterTax;
            }
            if (each.salaryAfterTax<minSalaryAfterTax){
                minSalaryAfterTax= each.salaryAfterTax;
            }
        }

        System.out.println("Max Salaries After tax: "+maxSalaryAfterTax);
        System.out.println("Min Salaries After tax: "+minSalaryAfterTax);


    }
}
