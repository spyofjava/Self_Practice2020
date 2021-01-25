package Constructors;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee("ibo1");
        System.out.println(employee1);

        System.out.println("===================================");

        Employee employee2=new Employee("ibo2","SDET");
        System.out.println(employee2);

        System.out.println("===================================");

        Employee employee3=new Employee("ibo2","SDET","333333333");
        System.out.println(employee3);

        System.out.println("===================================");

        Employee employee4=new Employee("ibo2","SDET","444444444",1000000);
        System.out.println(employee4);

    }

}
