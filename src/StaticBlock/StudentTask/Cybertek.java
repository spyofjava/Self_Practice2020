package StaticBlock.StudentTask;

public class Cybertek {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplIt, hasFlipGrid;

    static{
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplIt = true;
        hasFlipGrid = true;
    }

    public void setInfo(String schoolName,String dreamJob,boolean hasFlipGrid,boolean hasReplIt, String name,String gender,int age){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String toString() {
        return "CybertekStudent{ " +
                "name= " + name +
                ", gender= " + gender +
                ", age= " + age +
                ", School name= "+schoolName+
                ", Has replit: "+hasReplIt+
                ", Has Flipgrid: "+hasFlipGrid+
                '}';
    }

}
