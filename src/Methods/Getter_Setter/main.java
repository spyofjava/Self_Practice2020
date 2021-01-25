package Methods.Getter_Setter;
public class main {

    public static void main(String[] args) {

        Db obj1=new Db();

        obj1.insetData("abc", 123);
        obj1.getYint();


        System.out.println(obj1.getData());
        System.out.println(obj1.getYint());


        obj1.setData("sdhb");


        obj1.setYint(345);


        System.out.println(obj1.getData());


        System.out.println(obj1.getYint());


    }
}
