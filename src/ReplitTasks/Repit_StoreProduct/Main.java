package ReplitTasks.Repit_StoreProduct;

public class Main {
    public static void main(String[] args) {


        StoreProduct p1= new StoreProduct("a",1000,"xxx",true ,12);
        StoreProduct p2= new StoreProduct("b",2);
        StoreProduct p3= new StoreProduct("c",3,14);
        StoreProduct p4= new StoreProduct("d",4,"yyy",true);

        System.out.println(p1.stock);
        System.out.println(p1.category);
        System.out.println(p1.hasExpiration);
        System.out.println(p1.label);
        System.out.println(p1.price);

        System.out.println(p3.sale(14));

        System.out.println(p4.getDiscountedPrice(0.2));


    }



}
