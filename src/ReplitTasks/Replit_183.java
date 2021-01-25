package ReplitTasks;

public class Replit_183 {
    public static void main(String[] args) {
        System.out.println(limit("abcd",2));;
    }
    public static String limit(String text, int maxLength){

        String word="";
        for (int i=0;i< maxLength;i++){
            word+=text.charAt(i);


        }
        return word;
    }
}
