package Constructors;

public class Employee {


    public String name, jobTitle,ID;
    public double salary;

    public static String companyName;

    static {
        companyName="Tesla";
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, String ID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, String ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name= " + name + '\'' +
                ", jobTitle= " + jobTitle + '\'' +
                ", ID= " + ID + '\'' +
                ", salary= " + salary +
                ", Company Name= "+companyName+
                '}';
    }
}
