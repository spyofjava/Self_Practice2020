package Ibrahim;

public class UniqueStringinArray {
    public static void main(String[] args) {



        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};
        // 0      1      2      3           4       5       6       7       8
        int freq=0;

        for (int i=0;i< words.length;i++){
            freq=0;
            for (int j=0;j< words.length;j++){

                if (words[i].equals(words[j])){
                    freq++;
                }
            }
            if (freq==1){
                System.out.print(words[i]+" ");
            }
        }



    }
}
