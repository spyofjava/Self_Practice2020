package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.remove(2);
        int a = nums.size();
        System.out.println("size: " + a);
        System.out.println(nums);
        System.out.println(nums.get(1));

        nums.set(1, 900);
        System.out.println(nums);
        nums.remove(1);
        nums.add(1, 900);
        System.out.println(nums);


        ArrayList<Character> alp = new ArrayList<>();

        alp.add('A');
        alp.add('B');
        alp.add('C');
        alp.add('D');
        alp.add('Z');
        System.out.println(alp);
        alp.set(4, 'E');
        boolean r1 = alp.remove(Character.valueOf('K'));
        System.out.println(alp);
        System.out.println(alp.remove(Character.valueOf('K')));

        ArrayList<Integer> Odd = new ArrayList<>();
        ArrayList<Integer> Even = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                Even.add(i);
            } else {
                Odd.add(i);
            }

        }
        System.out.println(Even);
        System.out.println(Odd);
        System.out.println("last Even: " + Even.get(Even.size() - 1));
        System.out.println("last Odd: " + Odd.get(Odd.size() - 1));

        System.out.println("-=========================");







        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);

        int max = 0;
        int min = 0;
        for (int i=0;i<list2.size();i++){
            if (list2.get(i)>max){
                max=list2.get(i);
            }else if (list2.get(i)<min){
                min=list2.get(i);
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);

        for (int each:list2){
            if (each>max){
                max= each;
            }
            else if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("=================");

        for (int each:list2){
            max=Math.max(each,max);
            min= Math.min(each,min);
        }
        System.out.println(max);
        System.out.println(min);


        ArrayList<String> names=new ArrayList<>();
        names.add("Katy");  //0
        names.add("Amir");  // 1
        names.add("Nadira"); // 2
        names.add("Erjon");  // 3
        names.add("Amir");  //4
        names.add("Aibek"); // 5
        names.add("Ilgar");  //6
        names.add("Amir"); //7
        names.add("Amir"); //7

        names.remove(1);
        names.remove("Amir");
        System.out.println(names);
        names.remove("Amir");
        System.out.println(names);
        names.remove("Amir");
        System.out.println(names);

        names.clear();

        System.out.println(names);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3
        list.add(40);//4
        list.add(10);//5
        list.add(10);//6
        list.add(50);//7

        int n1=list.indexOf(10);
        int n2=list.lastIndexOf(10);
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(!list.contains(90));

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);


        ArrayList<Character> newList=new ArrayList<>();
        newList.add(characters.get(0));
        System.out.println(newList);
        for (char each:characters){
            if (!newList.contains(each)){
                newList.add(each);
            }
        }
        System.out.println(newList);
        System.out.println("======================");
    ArrayLists.NonDup.nonDup();

        System.out.println("==========================");



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);

        System.out.println(list1 == list3 );
        System.out.println(list1.equals(list3));


        list1.clear();
        list3.clear();

        System.out.println(list1.isEmpty());
        System.out.println(list3.isEmpty());



        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {90, 80, 70, 60};
        int[] arr4 = {40, 35, 45, 65, 7, 5};
        int[] arr5 = {35, 54, 67, 89, 98, 89, 76};
        int size = arr1.length + arr2.length+arr3.length+arr4.length+arr5.length;
        int[][] arr2D = {arr1, arr2, arr3, arr4, arr5};

        System.out.println(Arrays.deepToString(arr2D));
        ArrayList<Integer> classx=new ArrayList<>();

        for (int[] each1:arr2D){
            for (int each:each1){
                classx.add(each);
            }
        }
        System.out.println(classx);
    }






}

