package Constructors.exercise;

public class object {

    public static void main(String[] args) {

        person person = new person("ibrahim","uludag",38);

        System.out.println(person);
        person person1 = new person("i","d",23);
        System.out.println(person1);

        person1.getAge();

        System.out.println(person.name);
        System.out.println(person.lastname);
        person.getAge();


    }


}
