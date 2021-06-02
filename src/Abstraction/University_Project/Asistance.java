package Abstraction.University_Project;

public class Asistance extends Academicians {
    public String yuksekLisans;

    public Asistance(String name, String phone, String email) {
        super(name, phone, email);
    }

    @Override
    public void derseGir(int dersSaati) {
        System.out.println(name+" asistan olarak "+dersSaati+" saat derse girebilir");
    }

    public void lablaraGir(){
        System.out.println(name+"Asistan olarak lablara girebilir...");
    }

    public void quizleriOku(){
        System.out.println(name+"asistan olarak quizleri okuyabilir....");
    }

}
