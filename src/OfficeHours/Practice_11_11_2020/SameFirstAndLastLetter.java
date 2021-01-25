package OfficeHours.Practice_11_11_2020;

public class SameFirstAndLastLetter {
    public static void main(String[] args) {

        String[] word = {"Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin", "Maryam"};
        int count=0;
        for (String each:word){
            char firstLetter=each.toLowerCase().charAt(0);
            char lastLetter=each.toLowerCase().charAt(each.length()-1);
            if (firstLetter==lastLetter){
                count++;
            }
        }
        System.out.println(count);


    }
}
