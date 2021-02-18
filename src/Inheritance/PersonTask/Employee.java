package Inheritance.PersonTask;

public class Employee extends Person {


    public double hourlyRate;
    public String jobTitle,ID;


    public void work(){
        System.out.println(name+" is working");
    }

    public Employee(String name, int age, char gender, double hourlyRate,String jobTitle,String ID) {
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.jobTitle=jobTitle;
        this.ID=ID;

    }

    public double calcSalary(){
        return hourlyRate * 40 * 52 ;
    }



}
