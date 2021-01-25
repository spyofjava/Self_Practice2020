package ReplitTasks;

public class Replit_Methods_with_Arrays_3 {
    public static void main(String[] args) {
        String[] r = {"1","2","aa","1", "aa"};//1:3 2:
        System.out.println(getDup(r));
    }
    public static int getDup(String[] r) {
        String result = "";
        int k=0;
        for (int i = 0; i < r.length; i++) {
            int count = 0;
            for (int j = 0; j < r.length; j++) {
                if (r[i].equalsIgnoreCase(r[j])) {
                    count++;
                }
            }
            if (count>1) {
                k += count;//3, 1, 3, 3, 1
            }
        }

        return k;

    }
}
