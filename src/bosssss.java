import java.util.*;

public class bosssss {

    public static void main(String[] args) {


        /////  I N C E L E ///////

    }

    public void printPermutation(char[] ch) {
        for (String s : permutation(ch)) {
        System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    public Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1) { set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1); char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation); } } } return set;
    }
}
