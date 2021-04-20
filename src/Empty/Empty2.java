package Empty;

import java.util.ArrayList;
import java.util.Arrays;

public class Empty2 {

    public String name;
    public String lastName;
    public int age;

    public static void Person(String name,String lastName){
        System.out.print(name+" "+lastName);
        System.out.println("========Method 1============");
    }

    public  void Person(String name,String lastName,int age){
        System.out.print(name+" "+lastName+" "+age);
        System.out.println("========Method 2============");
    }

}

class Object{
    public static void main(String[] args) {
        Empty2 G = new Empty2();
        G.Person("ibrahim","uludag",38);


        Empty2.Person("ibrahim","uludag");


        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //arr[3]=4;
      //  arr[4]=5;
        System.out.println(Arrays.toString(arr));

    }
}