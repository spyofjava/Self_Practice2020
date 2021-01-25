package ReplitTasks;

public class Replit_178 {

    public static void main(String[] args) {
        System.out.println(mergeStrings("pythonc#linux", "java"));
    }

    public static String mergeStrings(String one, String two) {
        String result = "";
        int i = 0;
        int j = 0;
        while (true) {
            if (one.length() < two.length()) {
                if (i < one.length()) {
                    result += one.charAt(i);
                } else {
                    result += "";
                }
                if (j < two.length()) {
                    result += two.charAt(j);
                } else {
                    break;
                }
                i++;
                j++;
            } else {

                if (i < one.length()) {
                    result += one.charAt(i);
                } else {
                    break;
                }
                if (j < two.length()) {
                    result += two.charAt(j);
                } else {
                    result += "";
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
