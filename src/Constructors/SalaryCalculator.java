package Constructors;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public int numOfworkingDays, numOfWeeks;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;


    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {

        if (stateTaxRate>1){
            stateTaxRate/=100;
        }
        if (federalTaxRate>1){
            federalTaxRate/=100;
        }
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        numOfWeeks =52;
        numOfworkingDays = 5;
        salary = weeklyHours * hourlyRate * numOfWeeks;
        totalTax = salary * (stateTaxRate + federalTaxRate);
        salaryAfterTax = salary - totalTax;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return  "weeklyhours= "+weeklyHours+
                "\nhourly rate= "+hourlyRate+
                "\nstate tax rate= "+stateTaxRate+
                "\nfederal tax rate= "+federalTaxRate+
                "salary= " + df.format(salary) +
                "\nsalaryAfterTax= " + df.format(salaryAfterTax) +
                "\ntotalTax= " + df.format(totalTax);
    }
}



