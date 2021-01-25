package ReplitTasks;

public class Replit_184 {

    public static void main(String[] args) {

        System.out.println("\""+at3("blabla", "a")+"\"");
    }
    public static String at3(String target, String word) {

        String str = "";
        for (int i = 0; i < target.length(); i++){
            if (i == 3) {
                str += word;
            }
            str += target.charAt(i);
        }
        return str;
    }
}
