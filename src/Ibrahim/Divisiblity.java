package Ibrahim;

public class Divisiblity {
    public static void main(String[] args) {
        int number=65;
        System.out.println("==================================================\n\n");


        int reminderof2=number%2;
        boolean divisibleby2=reminderof2==0;
        System.out.println(number+" is divisible by 2: "+divisibleby2+"\n and after the division,remainder is: "+reminderof2);
        System.out.println("==================================================\n\n");


        int reminderof3=number%3;
        boolean divisibleby3=reminderof3==0;
        System.out.println(number+" is divisible by 3: "+divisibleby3+"\n and after the division,remainder is: "+reminderof3);
        System.out.println("==================================================\n\n");


        int reminderof5=number%5;
        boolean divisibleby5=reminderof5==0;
        System.out.println(number+" is divisible by 5: "+divisibleby5+"\n and after the division,remainder is: "+reminderof5);
    }
}
