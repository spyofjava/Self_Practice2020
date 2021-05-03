package University;

public class Assistants extends Academicians {


    public  String masterOfDegree;

    public Assistants(String titleName) {
        super(titleName);
    }

    public  void going_Lab(){

        System.out.println("going lab...as a "+titleName);
    }

    public  void reading_Quizzes(){
        System.out.println("reading quizzes...as a "+ titleName);
    }


}
