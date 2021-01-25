package Ibrahim;

public class UniqueNumbersInArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,1,2,4};
        int frequence;
        for (int i=0;i<arr.length;i++){
            frequence=0;
            for (int j=0;j<arr.length;j++){

                if (arr[i] == arr[j]) {
                    frequence++;
                    //1=1--->freq=1
                    //1=2
                    //1=3
                    //1=1--->freq=2
                    //1=2
                    //1=4
                }
            }
            if (frequence==1) {
                System.out.print(arr[i]+" ");
            }
        }



    }
}
