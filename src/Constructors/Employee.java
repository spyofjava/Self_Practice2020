package Constructors;

import java.text.DecimalFormat;

public class Employee {

    public String name, jobTitle,ID;
    public double salary;

    public Employee(String name){
        this.name=name;
    }

    public Employee(String name,String jobTitle){
        this.name=name;
        this.jobTitle=jobTitle;
    }

    public Employee(String name,String jobTitle,String ID){
        this(name,jobTitle);
        this.ID=ID;
    }

    public Employee(String name,String jobTitle,String ID,double salary){
        this(name,jobTitle,ID);
        this.salary=salary;
    }

    @Override
    public String toString() {

        return  "name= " + name + '\n' +
                "jobTitle= " + jobTitle + '\n' +
                "ID= " + ID + '\n' +
                "salary= $" + salary;
    }
}
