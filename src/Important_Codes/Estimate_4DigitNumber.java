package Important_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Estimate_4DigitNumber {


    public static void main(String[] args) {
        int count = 7;
        while (count >= 0) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a 4 digit number: ");
            int inputNumber = scan.nextInt();

            if (inputNumber >= 1000 && inputNumber <= 9999) {

                System.out.println("You have " + --count + " right of entry");



                int answerNumber = 4578;
                //               1234
                int first = inputNumber / 1000;
                int second = (inputNumber / 100) % 10;
                int third = (inputNumber / 10) % 10;
                int fourth = (inputNumber % 10);
                ArrayList<Integer> listInputNumber = new ArrayList<>(Arrays.asList(first, second, third, fourth));
                //------------------------------

                int correctfirst = answerNumber / 1000;
                int correctsecond = (answerNumber / 100) % 10;
                int correctthird = (answerNumber / 10) % 10;
                int correctfourth = (answerNumber % 10);
                ArrayList<Integer> listAnswerNumber = new ArrayList<>(Arrays.asList(correctfirst, correctsecond, correctthird, correctfourth));


                int wrongOrder = 0;
                int correctOrder = 0;


                for (int i = 0; i < listInputNumber.size(); i++) {
                    for (int j = 0; j < listAnswerNumber.size(); j++) {
                        if (listInputNumber.get(i) == (listAnswerNumber.get(j))) {
                            if (i == j) {
                                correctOrder++;
                            } else {
                                wrongOrder++;
                            }

                        }
                    }
                }

                if (correctOrder > 0) {
                    if (correctOrder == 4) {
                        System.out.println("you won!!!!!!!");
                        break;
                    } else {
                        System.out.println("you found " + correctOrder + " digit that it was on correct place");
                    }
                }

                if (wrongOrder > 0) {
                    System.out.println("you found " + wrongOrder + " digit that it was on different place");
                }


                if (count == 0) {
                    System.out.println("Failed!!! You tried 7 times that is wrong input");
                    break;
                }

            }else {
                System.out.println("Enter 4 digit!!!!");
            }


        }

    }

}
