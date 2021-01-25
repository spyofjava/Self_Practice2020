package ReplitTasks;

public class Replit_179 {

    public static void main(String[] args) {
        System.out.println(uniqueChars("wooden-spoon"));
    }
    public static String uniqueChars(String str) {

        String word = new String();
        for (int i = 0; i < str.length(); i++) {
            if (!word.contains("" + str.charAt(i))) {
                word += str.charAt(i);
            }
        }
        return (word);
    }
}
