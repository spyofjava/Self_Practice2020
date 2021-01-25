package Methods;

public class UniqueChar {

    public static void main(String[] args) {

        String str1 = "Hi how are you? How is it going?";

        String str = str1.toLowerCase();



    }
    public static void UniqueChar(String str){
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + ": " + count);
            if (count == 1) {
                System.out.println("Unique character: " + str.charAt(i));
            }
        }
    }
}
