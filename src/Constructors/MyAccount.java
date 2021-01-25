package Constructors;

public class MyAccount{

    public String name,Email,gsm,hesapNo;
    public double balance;

/*
    public MyAccount(){
        this("58762136576",324168,"Ibrahim uludag","ibrahimhocamm@gmail.com","3241643216");
    }


 */
    public MyAccount(String name,String Email,double balance){
        this.name=name;
        this.Email=Email;
        this.balance=balance;
    }

    public  MyAccount(String name,String Email){
        this.name=name;
        this.Email=Email;
    }

    public MyAccount(String hesapNo,double balance,String name,String Email,String gsm){
        this.hesapNo=hesapNo;
        this.balance=balance;
        this.name=name;
        this.Email=Email;
        this.gsm=gsm;
    }

    @Override
    public String toString() {
        return  "name= " + name + '\n' +
                "Email= " + Email + '\n' +
                "gsm= " + gsm + '\n' +
                "hesapNo= " + hesapNo + '\n' +
                "balance= " + balance;
    }
}
