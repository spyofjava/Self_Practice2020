package Ibrahim;

public class sep_29 {
    public static void main(String[] args) {

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");



        int gallons=51;
        int cnvrt= (int) (gallons*3.785);
        System.out.println(gallons+" gallons equal to "+cnvrt+" liters");


        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");

        int a=100;
        int b= -a++ + ++a - a-- * a-- %2;
        //   = -100 + 102 - 102 * 101 %2
        //   =      2     -10302%2
        //   =      2     - 0
        //   =      2
        System.out.println(b);
        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");


        int n=-5200;

        boolean result=n>0;
        boolean result2=n<0;

        String f=(result)? n+ " is positive number: "+result:n+" is positive number: "+result;
        System.out.println(f);


        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");

        int kg=10;

        System.out.println(kg+" kg equal to "+ (int)(kg*2.20462)+" pounds");

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");

        int n1=455;
        int n2=75621;

        boolean q1=n1<n2;
        boolean q2=n1>n2;

        System.out.println(n1+" is greater than "+n2+": "+q2);
        System.out.println(n1+" is less than "+ n2+": "+q1);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");


        int g=52;
        boolean divisibleby13=g%13==0;
        int reminderof13=g%13;
        int result3=g/13;
        System.out.println(g+" is divisible by 13 exactly: "+divisibleby13+"\n"+
                g+" divide by 13 is equal to "+result3+" with reminder is "+reminderof13);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");


        /*

                  *  *     *  *
                *       *       *
                 *             *
                   *         *
                     *     *
                        *

         */
        String d="ibrahim";
        String e="bad guy";
        boolean k1=d==e;
        boolean k2=!k1;
        String h=(k1)? d+" is "+e+": "+k1:d+" is not a "+e+": "+k2;
        System.out.println(h);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");



        int y=244327;

        boolean even=y%2==0;
        boolean odd=y%2!=0;
        String g1=(even)? y+" is even number: "+even: y+" is odd number : "+odd+"\n";
        System.out.println(g1);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");



        float salary=234134f;

        double tax=salary*0.28;
        float salary1=salary;
          salary-= salary*0.28;

         String g5="Your Salary is $"+salary1+"\n"+"Your tax is $"+tax+"\n"+"Salary After tax is $"+salary;
        System.out.println(g5);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");


        double house=1200000;
        int month=240;
         house/=month;
        String w="Your monthly payment is $"+house;
        System.out.println(w);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");
















    }
}
