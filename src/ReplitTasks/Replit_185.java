package ReplitTasks;

public class Replit_185 {
    public static void main(String[] args) {
        System.out.println(biggerS("apple","orange"));;
    }
    public static String biggerS(String a ,String b){
        String longest;
        if (a.length()>b.length()){
            longest=a;
        }else {
            longest=b;
        }
        return longest;
    }
}
