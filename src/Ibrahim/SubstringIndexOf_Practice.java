package Ibrahim;

import java.util.Scanner;

public class SubstringIndexOf_Practice {
    public static void main(String[] args) {

        //<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));


        String phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        String messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message Body: "+messageBody);



    }
}
