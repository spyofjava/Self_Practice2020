package Abstraction.University_Project;

public class Workers {
    public String name;
    public String phone;
    public String email;

    public Workers(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void signIn(){
        System.out.println(" Giris yapildi.");
    }

    public void logOut(){
        System.out.println(" Cikis yapildi.");
    }

    public void eating(){
        System.out.println(" Yemek yiyebilir.");
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
