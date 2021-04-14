package Empty;

public class Empty2 {

    public static void main(String[] args) throws InterruptedException {

        int wd=0;
        String[] arr = {"a","b"};
        for (int i = 0; i < 2; i++) {
            Thread.sleep(600);
            switch (arr[i]){

                case "b":
                    System.out.println("b");
                case "a":
                    System.out.println("a");
                case "c":
                    System.out.println("c");
                    break;
                case "d":
                    System.out.println("d");
            }

        }

    }
}
