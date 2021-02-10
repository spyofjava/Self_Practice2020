package Constructors;

import java.util.ArrayList;
import java.util.Arrays;

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

    @Override
    public String toString() {
        return "ConstructorCall{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", Age= "+age+
                ", Job title= "+jobTitle+
                '}';
    }
}
class ConstructorCallObject{

    public static void main(String[] args) {


        System.out.println(ConstructorCall.age);
        System.out.println(ConstructorCall.jobTitle);

        ConstructorCall obj1 = new ConstructorCall("Ali","Jamal",'M');
        ConstructorCall obj2 = new ConstructorCall("ayse","hayla",'F');
        ConstructorCall obj3 = new ConstructorCall("Jennifer","kiny",'F');
        System.out.println(obj1);

        System.out.println("------------------------------------------");
        ArrayList<String> firstnames =new ArrayList<>(Arrays.asList(obj1.firstName,obj2.firstName,obj3.firstName));
        ArrayList<ConstructorCall> list =new ArrayList<>(Arrays.asList(obj1,obj2,obj3));
        System.out.println(firstnames);

        System.out.println("------------------------------------------");

        System.out.println(list);

        System.out.println(obj1.gender =='F');

        ArrayList<ConstructorCall> Female = new ArrayList<>();

        for (ConstructorCall each :list) {
            if (each.gender=='F'){
                Female.add(each);
            }
        }
        System.out.println(Female);

    }
}
