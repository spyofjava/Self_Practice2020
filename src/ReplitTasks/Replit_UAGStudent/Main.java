package ReplitTasks.Replit_UAGStudent;

public class Main {

    public static void main(String[] args) {

        UAGStudent s1= new UAGStudent("muhammet", 11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);

        System.out.println(s1);
        UAGStudent.newPrincipal("ali");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        UAGStudent.resetID();
        System.out.println(s2);


    }



}
