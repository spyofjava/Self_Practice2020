package Ibrahim;

public class CountJavaPythonWithArray {
    public static void main(String[] args) {

        String sentence = "I love Java, java is a cool programming language and java is more useful than javascript, python python";

        int countjava=0;
        int countpython=0;
        String[] newsentence=sentence.split(" ");

        for (int i=0;i<newsentence.length;i++) {
            if (newsentence[i].toLowerCase().contains("java")) {

                countjava++;
            }
            if (newsentence[i].toLowerCase().contains("python")){
                countpython++;
            }
        }
        System.out.println("java: "+countjava);
        System.out.println("python: "+countpython);


    }
}
