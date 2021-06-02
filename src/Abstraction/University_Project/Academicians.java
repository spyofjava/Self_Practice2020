package Abstraction.University_Project;

public abstract class Academicians extends Workers{

    public String bolum;
    public String gorev;
    public String dersler;



    public Academicians(String name, String phone, String email) {
        super(name, phone, email);
    }


    public abstract void derseGir(int dersSaati);


}
