package Inheritance.CarTask;

import Inheritance.AnimalTask.Cat;
import Inheritance.AnimalTask.Tiger;

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("bengal tiger","orange","sher khan","large",'M',5);
        System.out.println( tiger);

        System.out.println(tiger.breed);
        tiger.hunt();
        tiger.roar();
        tiger.drink("water");
        tiger.sleep();
        tiger.eat("meat");

        Cat cat =new Cat("British fold","White","Kitty","medium",'F',3);

        cat.meow();


    }

}
