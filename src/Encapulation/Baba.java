package Encapulation;

public class Baba {
    public String name;
    public String lastName;
    private static String Bank_account;
    public String diploma;
    protected String status;

    static {
        Bank_account="I$Bank";
    }

    public Baba(String name, String lastName, String diploma, String status) {
        this.name = name;
        this.lastName = lastName;
        this.diploma = diploma;
        this.status = status;
    }

    public static String  getBank_account() {
        return Bank_account;
    }

    public static void setBank_account(String bank_account) {
        Bank_account = bank_account;
    }


    @Override
    public String toString() {
        return  " name= " + name + '\'' +
                ", lastName= " + lastName + '\'' +
                ", diploma= " + diploma + '\'' +
                ", status= " + status + '\'' +
                ", Bank_account= "+getBank_account()+
                '}';
    }
}
