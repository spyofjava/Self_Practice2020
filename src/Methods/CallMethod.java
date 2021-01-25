package Methods;

import Arrays.CombineTwoArrays;

import java.util.Arrays;

public class CallMethod {
    public static void main(String[] args) {

        String[] group3={"Asel","Rauf","Ibrahim","Erhan","Halil","Hanieh","Ruzanna","Jiamila","Jimell","Sofia","Yilihamu","Nueraihemaiti"};
        String[] group31 = {"Livio", "Steph", "Dan","Sobir","Atala", "Yusef","Saafir"};

        System.out.println(Arrays.toString(CombineTwoArrays.Combine2Arrays( group3, group31)));

        EligibleToVote.eligibilityToVote("ibrahim","Turkey",12,false);


        Calculator.calculator(45,'/',9);

    }




}
