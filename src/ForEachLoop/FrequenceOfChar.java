package ForEachLoop;

public class FrequenceOfChar {
    public static void main(String[] args) {


        String[] str={"a","b","c","a","b","b"};


        for (String each:str){
            int count=0;
            String element=each;
            for (int i=0;i< str.length;i++){
                if (element==str[i]){
                    count++;
                }
            }
            if (count==1){
                System.out.println("Unique element: "+element);
            }

        }


    }
}
