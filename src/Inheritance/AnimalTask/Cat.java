package Inheritance.AnimalTask;

public class Cat extends Animal {


    public Cat(String breed, String color, String name, String size, char gender, int age) {
        super(breed, color, name, size, gender, age);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
