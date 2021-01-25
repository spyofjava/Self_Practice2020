package ReplitTasks.Replit_232_Overriding;

public class Main {


    public static void main(String[] args) {

        EducationalInstitution educationalInstitution=new EducationalInstitution(6);

        System.out.println(educationalInstitution.graduationRequirements());

        LawSchool lawSchool=new LawSchool();
        System.out.println(lawSchool.graduationRequirements());


    }
}
