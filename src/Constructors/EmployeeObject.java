package Constructors;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("ali","SDET","001",132165);
        System.out.println(employee1);

        // ---------------we can call the 'Company Name' to be Static by class name------------------
        System.out.println( Employee.companyName);


    }
}
