package Empty;

public class E_Object {
    public static void main(String[] args) {


        A a = new A("Haci Kemal","Erimez");
        System.out.print(a.getName()+" ");
        System.out.println(a.getLastName());
        a.setName("Hz Muhammet");
        a.setLastName("Mustafa (SAV)");

        System.out.println(a.getName()+" "+a.getLastName());




    }
}
