package Abstraction.University_Project;

public class Teachers extends Academicians {

    public String unvan;

    public Teachers(String name, String phone, String email) {
        super(name, phone, email);
    }

    @Override
    public void derseGir(int dersSaati) {
        System.out.println(name+" teacher olarak "+dersSaati+" saat derse girebilir");
    }

    public  void toplantilaragir(){

    }

    public void sinavlariOku(){

    }


}
