package CustomClass.EmployeeTask;

import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public  String name,jobTitle,ID,companyName;
    public double salary;
    public LocalDate hireDate;
    public char gender;


    public void setInfo(String name,char gender, String jobTitle,String ID,String companyName,LocalDate hireDate,double salary){

        this.name=name;
        this.jobTitle=jobTitle;
        this.gender=gender;
        this.ID=ID;
        this.companyName=companyName;
        this.hireDate=hireDate;
        this.salary=salary;
    }


    public void getInfo() {
        DateTimeFormatter df =DateTimeFormatter.ofPattern("M-dd-yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println(
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=$ " + decimal.format(salary) +
                ", hireDate=" + df.format(hireDate) +
                ", gender=" + gender );
    }

    public void working(){
        System.out.println(name+" is working");
    }

    public void meeting(){
        System.out.println(name+" is in a meeting");
    }
}
