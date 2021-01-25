package ReplitTasks;

public class Replit_181 {
    public static void main(String[] args) {

        String words = "foo bar";
        System.out.println(wordCount(words));;
    }


    public static int wordCount(String words) {
        int count;
        String[] arr = words.split(" ");
        count=arr.length;

        return count;
    }
}
