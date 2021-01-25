package ReplitTasks;

public class Replit_200 {
    public static void main(String[] args) {
        String str="error foo bar";
        System.out.println(isError(str));

    }

    public static boolean isError(String line){

        if (line.substring(0,5).equalsIgnoreCase("error")){
            return true;
        }else {
            return false;
        }

    }
}
