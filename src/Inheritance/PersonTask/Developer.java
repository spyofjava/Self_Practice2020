package Inheritance.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        super(name, age, gender, hourlyRate, jobTitle, ID);
    }


    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }

}
