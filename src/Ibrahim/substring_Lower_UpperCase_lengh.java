package Ibrahim;

public class substring_Lower_UpperCase_lengh {
    public static void main(String[] args) {


        String a="CyberTEK";
        //01234567

        a=a.toUpperCase();
        System.out.println(a);

        a=a.toLowerCase();
        System.out.println(a);

        int b=a.length();
        System.out.println(b);
        //

        a=a.substring(3,a.length()).toUpperCase();
        System.out.println(a);//ERTEK

        String c="ibrahimhocamm@gmail.com";
        String d=c;
        c=c.substring(13,19);
        System.out.println(c);


        int f=d.length();
        System.out.println(f);

        d=d.substring(0,d.length()).toUpperCase();
        System.out.println(d);


        String g="ALIKARAbiyik";
        g=g.substring(0,7).toLowerCase()+g.substring(8,g.length()).toUpperCase();
        System.out.println(g);





    }
}
