package Important_Codes;

public class NiceStringTask {

    public static String startOz(String str) {

        String result="";
        if (str.length()>2) {
            if (str.startsWith("oz", 0)) {
                result = str.substring(0, 2);
            }
            else if (str.substring(0, 2).contains("o")) {
                if (str.startsWith("zo", 0)) {
                    result="";
                }else {
                    result = ("o");
                }
            } else if (str.substring(0, 2).contains("z")) {
                result = ("z");
            }
            return result;
        }else {
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(startOz("zoo"));
    }


}
