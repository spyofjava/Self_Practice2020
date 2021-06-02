package Abstraction.University_Project;

public class Security_Guard extends Officers{

    public String belge;

    public Security_Guard(String name, String phone, String email) {
        super(name, phone, email);
    }

    public void nobet(){
        System.out.println("nobet tutuyor...");
    }
}
