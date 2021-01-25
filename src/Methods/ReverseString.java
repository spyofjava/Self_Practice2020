package Methods;

public class ReverseString {


    public static void main(String[] args) {

        reverse("Cybertek");

    }

    public static void reverse( String word){
        String newword="";
        for (int i = word.length()-1; i >= 0 ;i--){
            newword+=word.charAt(i);
        }
        System.out.println(newword);

    }


}



