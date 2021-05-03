package University;

public class Teachers extends Academicians{


    public  String job_Title;

    public Teachers(String titleName) {
        super(titleName);
    }

    public  void joining_meetings(){

        System.out.println("joining meetings...as a "+titleName);
    }

    public  void reading_Exams(){

        System.out.println("reading exams...as a "+titleName);
    }



}
