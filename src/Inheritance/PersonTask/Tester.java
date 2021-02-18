package Inheritance.PersonTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        super(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void test(){
        System.out.println(jobTitle+" "+name+ " is testing");
    }
}
