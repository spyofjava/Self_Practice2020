package Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    DateTimeFormatter df= DateTimeFormatter.ofPattern("MM/dd/yy");

    public String name,mail;
    public LocalDate DOB;
    public int age;
    public boolean hasSDETCertificate;


    public void  setInfo(String name, String mail, LocalDate DOB){

        this.name=name;
        this.mail=mail;
        this.DOB=DOB;
        this.hasSDETCertificate=true;
        age=LocalDate.now().getYear()-DOB.getYear();
    }

    public static void oldperson(){
        System.out.println("you are pretty old person for the programming!!");
    }

    public static void youngperson(){
        System.out.println("you are the person that we are looking for.");
    }



    @Override
    public String toString() {
        return "name: " + name +'\n' +
                "mail: " + mail + '\n' +
                "age: " + age+"\n"+
                "Has SDET Certificate: "+hasSDETCertificate;
    }
}
