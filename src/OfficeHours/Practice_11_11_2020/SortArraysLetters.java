package OfficeHours.Practice_11_11_2020;

import java.util.Arrays;

public class SortArraysLetters {
    public static void main(String[] args) {

        String str1 = "acb";
        String str2 = "fed";

        String[] arr1=str1.split("");
        String[] arr2=str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        boolean IsAnagram=Arrays.equals(arr1,arr2);
        System.out.println(IsAnagram);
    }
}
