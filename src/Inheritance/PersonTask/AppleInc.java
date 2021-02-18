package Inheritance.PersonTask;

public class AppleInc {

    public static void main(String[] args) {

        Developer developer = new Developer("Necdet",24,'F', 45, "SDET", "A124");

        System.out.println(developer.name);

        System.out.println(developer.jobTitle);

        System.out.println(developer.gender);

        System.out.println(developer);//----> we created a to string method in this class that's why it will be printed out with its own class name

        Tester tester = new Tester("Aliyovic",34,'M',55,"DEVELOPER","1200012");

        System.out.println(tester.name);
        tester.test();
        tester.calcSalary();
        System.out.println(tester);//---> pay attention here ... we didn't put  to string method that's why output of tester will be printed out with name of its parent class



    }
}

