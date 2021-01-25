package Ibrahim;

public class SalaryCalculator {
    public static void main(String[] args) {

        /*salary=10000
        tax=0.28
        totaltax=...
        after tax=...
         */

        double salary = 10000;
        double tax = 0.28;
        double totaltax = salary * tax;
        System.out.print("Total Tax:");
        System.out.println(totaltax);
        double salaryaftertax = salary - totaltax;
        System.out.print("Salary After Tax:");
        System.out.println(salaryaftertax);



    }
}
