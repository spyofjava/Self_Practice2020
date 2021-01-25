package Constructors;

public class MyAccountObjects {

    public static void main(String[] args) {

        MyAccount account1 = new MyAccount("ibrahim","ibrlhffcx@gmail.com");
        System.out.println(account1);
        /*
        System.out.println("name: "+account1.name);
        System.out.println("email: "+account1.Email);
        System.out.println("balance: "+account1.balance);
        System.out.println("Account no: "+account1.hesapNo);
        System.out.println("Gsm: "+account1.gsm);

         */

        System.out.println("====================");

        MyAccount account2 =new MyAccount("ibo","ibo@gmail.com",111111.0);
        System.out.println("name: "+account2.name);
        System.out.println("email: "+account2.Email);
        System.out.println("balance: "+account2.balance);
        System.out.println("Account no: "+account2.hesapNo);
        System.out.println("Gsm: "+account2.gsm);

        System.out.println("=====================");
        MyAccount account3=new MyAccount("123456789", 222 , "ibis", "ibis@gmail.com","55555555" );
        System.out.println("name: "+account3.name);
        System.out.println("email: "+account3.Email);
        System.out.println("balance: "+account3.balance);
        System.out.println("Account no: "+account3.hesapNo);
        System.out.println("Gsm: "+account3.gsm);


    }
}
