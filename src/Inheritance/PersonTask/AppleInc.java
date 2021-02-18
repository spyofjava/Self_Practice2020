package Inheritance.PersonTask;

public class AppleInc {

    public static void main(String[] args) {

        Developer developer = new Developer("Necdet",24,'F', 45, "SDET", "A124");

        System.out.println(developer.name);

        System.out.println(developer.jobTitle);

        System.out.println(developer.gender);


        Tester tester = new Tester("Aliyovic",34,'M',55,"DEVELOPER","1200012");

        System.out.println(tester.name);
        tester.test();
        tester.calcSalary();


    }
}

