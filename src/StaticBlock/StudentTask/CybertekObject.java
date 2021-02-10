package StaticBlock.StudentTask;

public class CybertekObject {


    public static void main(String[] args) {
        Cybertek student1 = new Cybertek();

        System.out.println(student1);

//------------------ instance variables has to be called by an object that is created
        student1.age=19;
        student1.name="ali";
        student1.gender="M";

        //----------Variables of In Static block' body are  default values ----------

        System.out.println("Cybertek.schoolName = " + Cybertek.schoolName);

        System.out.println(student1);






    }
}
