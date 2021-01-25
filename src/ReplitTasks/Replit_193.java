package ReplitTasks;
import java.util.ArrayList;
public class Replit_193 {
    public static void main(String[] args) {
        String[] str1 = {"a", "b"};
        String[] str2 = {"c", "d"};

        System.out.println(combineRs(str1, str2));
    }

    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> list = new ArrayList<>();
        for (String each : r1) {
            list.add(each);
        }
        for (String each : r2) {
            list.add(each);
        }
        return list.toString().replace(", ", "").replace("[", "").replace("]", "");
    }
}
