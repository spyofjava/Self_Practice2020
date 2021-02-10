package Constructors;

public class ConstructorCall {
    public String firstName,lastName;
    public char gender;

    public static int age;
    public static String jobTitle;

    static {
        age=35;
        jobTitle="Software Developer";
    }

    public ConstructorCall(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
class ConstructorCallObject{

    public static void main(String[] args) {


    }
}
