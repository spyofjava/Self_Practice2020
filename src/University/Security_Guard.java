package University;

public class Security_Guard extends Officers{



    public String document;

    public Security_Guard(String titleName) {
        super(titleName);
    }

    public void guard(){

        System.out.println("guarding...as a "+titleName);
    }
}
