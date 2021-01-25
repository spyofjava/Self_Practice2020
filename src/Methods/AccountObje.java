package Methods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountObje {

    public static void main(String[] args) {

        Account account1 =new Account();
        account1.setInfo("ibrahim", "ibrahimhocamm@gmail.com", LocalDate.of(1983, 5, 29));


        System.out.println("====================================");
        Account account2 =new Account();
        account2.setInfo("xcfd", "tram@gmail.com", LocalDate.of(1989, 9, 13));

        Account account3=new Account();
        account3.setInfo("zzaf", "az@gmail.com", LocalDate.of(1948, 4, 25));

        Account account4 =new Account();
        account4.setInfo("hker", "Zam@gmail.com", LocalDate.of(1977, 7, 18));

        Account account5 =new Account();
        account5.setInfo("Bahraima", "asduxiam@gmail.com", LocalDate.of(1953, 2, 2));


        ArrayList<Account> list=new ArrayList<>();
        list.addAll(Arrays.asList(account1,account2,account3,account4,account5));

        for (Account each:list) {
            if (each.age > 50) {
                System.out.println(each);
                Account.oldperson();
                System.out.println("=======================");
            } else {
                System.out.println(each);
                Account.youngperson();
                System.out.println("=======================");

            }
        }
    }

}
