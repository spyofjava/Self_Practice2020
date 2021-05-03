package University;

import com.oracle.tools.packager.mac.MacAppBundler;

import java.util.*;

public class Workers {

    public  String titleName;
    public  String eMail;
    public  int Phone_Number;

    public Workers(String titleName) {
        this.titleName = titleName;
    }


    public  void LogIn() {
        System.out.println(titleName+" logged in the system....");
/*
        ArrayList<String> usernames = new ArrayList<>(Arrays.asList("Ibrahim Uludag", "Sabiha Uludag", "Muhammet Taha Uludag", " Sare Meliha Uludag"));
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("Uludag@42", "mxml", "14819007", "12345"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Username: ");
            String username = scan.nextLine();

            System.out.println("Password: ");
            String password = scan.nextLine();

            if (usernames.contains(username) && passwords.contains(password)) {

                System.out.println("Welcome...."+fullName);
                break;
            } else {
                System.out.println("try again....");
            }

        }

 */

    }


    public  void LogOut(){

        System.out.println("Logging Out ......");

    }

    public  void eat(){
        System.out.println(titleName+" eating at restaurant of University");
    }


}
