package Abstraction.University_Project;

public class Univ_Object {

    public static void main(String[] args) {


        Asistance asistance = new Asistance("Mehmet ali Ergun", "0242 4214663", "kjhagdf@gmail.com");
        asistance.derseGir(54);
        System.out.println(asistance);
        //Academicians academicians = new Academicians("Moly","864958","KHGf@gmail.com");

        Teachers teachers = new Teachers("Ibrahim", "0245 358 64 23", "lkhgsd@gmail.com");
        teachers.derseGir(12);
        System.out.println(teachers);


        Security_Guard security_guard = new Security_Guard("Ayse", "098375987", "iugsdfb@gmail.com");
        System.out.println(security_guard);
        Information_Process information_process = new Information_Process("jason", "08634986", "74gi@gmail.com");
        System.out.println(information_process);


    }
}
