package University;

public class Officers extends Workers{



    public  String department;
    public  String shift;

    public Officers(String titleName) {
        super(titleName);
    }

    public  void work(){
        System.out.println("working...as a "+ titleName);
    }
}
