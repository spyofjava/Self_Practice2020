package Inheritance.Animals;

public class Zoo {

    public static void main(String[] args) {


        Dog dog=new Dog("john", "dalmatian", "white dot black", "big", 'M',3);

        System.out.println(dog);
        dog.bark();
        System.out.println(dog.breed);
        System.out.println(dog.color);
        System.out.println(dog.gender);
        Tiger tiger =new Tiger("A", "B","blue", "small", 'F',4);
        System.out.println(tiger);
        Cat cat=new Cat("X", "Y", "Z", "Medium", 'F', 2);
        System.out.println(cat);

        cat.eat("tuna");

    }




}
