package CustomClass.EmployeeTask;

import org.omg.PortableInterceptor.INACTIVE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BankOfAmerica {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("ahmet",'M',"SDET","123","BOFA", LocalDate.of(2020,5,12),140000);

        Employee employee2 = new Employee();
        employee2.setInfo("ayse",'F',"SM","124","BOFA", LocalDate.of(2010,3,22),170000);

        Employee employee3 = new Employee();
        employee3.setInfo("nicolas",'M',"PO","120","BOFA", LocalDate.of(2017,9,15),150000);

        Employee employee4 = new Employee();
        employee4.setInfo("jennifer",'F',"Developer","122","BOFA", LocalDate.of(2016,4,8),149000);


        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4));

        double max = 0;
        String nm="";
        for (Employee each:list) {
            System.out.println(each.name +" ------> "+ each.jobTitle+" ------> "+each.salary);

            for (int i = 0; i < list.size(); i++) {
                if (max < list.get(i).salary){
                    max = list.get(i).salary;
                    nm = list.get(i).name;
                }
            }

        }
        System.out.println("max salary = $" + max+"----->"+"name= "+nm);

        ArrayList<Double> salaries = new ArrayList<>();
        for (Employee each:list) {
            salaries.add(each.salary);
        }

        System.out.println(salaries);
        System.out.println("max(salaries) = " + Collections.max(salaries));

        Collections.swap(salaries,1,3);
        System.out.println(salaries);


        employee1.getInfo();

    }


}
