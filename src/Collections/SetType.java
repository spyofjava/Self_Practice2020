package Collections;

import com.sun.xml.internal.xsom.impl.scd.Step;
import sun.plugin.javascript.navig4.Link;

import java.util.*;

public class SetType {

    public static void main(String[] args) throws InterruptedException {

        Set<String> name1= new HashSet<>(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));
        //name1.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));//rondomly
        System.out.println("name1 = " + name1);
        System.out.println("====================================================");

        Set<String> name2 =new LinkedHashSet<>();
        name2.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));// sorted insertion order
        System.out.println("name2 = " + name2);
        System.out.println("====================================================");

        Set<String> name3=new TreeSet<>();
        name3.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));//sorted alphabetical
        System.out.println("name3 = " + name3);
        System.out.println("====================================================");

        String str="aaaabbbbbbccccdddddeeeefffffggg";
        String result="";
        //LinkedHashSet hs= new LinkedHashSet(Arrays.asList(str.split("")));
       /*
        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            result+=s;
        }

        */

        //String[]arr=str.split("");//[a, a, a, a, a, a, b, b, b, b, b, b, b, b, b, c, c, c, c, c, c, c, c, c, c, c, c, c, d, d, d, d, d, d, d, d, d, e, e, e, e, e, e, f, f, f, f, f, f, f, f, f, f, f, g, g, g, g, g, g, g]

        LinkedHashSet<String> hs=new LinkedHashSet<>(Arrays.asList(str.split("")));


        for (String each : hs) {
            result+=each;
        }

        System.out.println(result);
//        HashSet hs1=new HashSet();
//        hs1.addAll(Arrays.asList(arr));
//        System.out.println(hs1);

        //List<String > s1=Arrays.asList(str.split(""));
        //Set<String> l=new HashSet<>(Arrays.asList("d","c","a","b"));
       // System.out.println(l);

        Set<Integer> num1= new HashSet<>(Arrays.asList(6,8,4,3,7,5,1));
        System.out.println("num1 = " + num1);

        Set<Integer> num2= new LinkedHashSet<>(Arrays.asList(6,8,4,3,7,5,1));
        System.out.println("num2 = " + num2);


        Set<Integer> num3= new TreeSet<>(Arrays.asList(6,8,4,3,7,5,1));
        System.out.println("num3 = " + num3);

        Set<String> str1=new HashSet<>(Arrays.asList("z","d","s","w","h"));
        System.out.println("str1 = " + str1);

        Set<String> str2=new LinkedHashSet<>(Arrays.asList("z","d","s","w","h"));
        System.out.println("str2 = " + str2);

        Set<String> str3=new TreeSet<>(Arrays.asList("z","d","s","w","h"));
        System.out.println("str3 = " + str3);

        Set<Integer> n1= new HashSet<>(Arrays.asList(4,78,6,14,9,35,95,6));
        System.out.println("n1 = " + n1);

        Set<Integer> n2= new LinkedHashSet<>(Arrays.asList(4,78,6,14,9,35,95,6));
        System.out.println("n2 = " + n2);
        Set<Integer> n3= new TreeSet<>(Arrays.asList(4,78,6,14,9,35,95,6));
        System.out.println("n3 = " + n3);

        String s1="now";
        String s2="won";

        //String st1=new TreeSet<>(Arrays.asList(s1.split(""))).toString();
        //String st2=new TreeSet<>(Arrays.asList(s2.split(""))).toString();
        Set<String> st1=new TreeSet<>(Arrays.asList(s1.split("")));
        Set<String> st2=new TreeSet<>(Arrays.asList(s2.split("")));
        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);
        System.out.println(st1.equals(st2));

        TreeSet<String> n=new TreeSet<>(Arrays.asList("a","a","a"));
        System.out.println("n = " + n);
/*
        TreeSet<String> m =new TreeSet<>(Arrays.asList(null,null,null));
        System.out.println("m = " + m);


 */











    }

}
