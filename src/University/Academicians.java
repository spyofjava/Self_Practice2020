package University;

public class Academicians extends Workers{

    public  String section;
    public  String mission;
    public  String lessons;

    public Academicians(String titleName) {
        super(titleName);
    }


    public  void going_Classroom(){
        System.out.println("going classroom...as a "+titleName);
    }



}
