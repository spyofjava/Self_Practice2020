package Important_Codes;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "aaaaabbbbbccccccccc";  // "a3b2c1"

        String bos="";
        for (int i=0;i<str.length();i++){
            String ch=""+str.charAt(i);
            if (!bos.contains(ch)){
                bos+=ch;                //{a,
            }
        }


        for (int j=0;j<bos.length();j++){
            char eachchar=bos.charAt(j); //eachchar=a
            int count=0;
            for (int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                if (eachchar==ch) {
                    count++;
                }
            }
            System.out.print(""+eachchar+(count));
        }



    }
}
