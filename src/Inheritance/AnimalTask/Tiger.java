package Inheritance.AnimalTask;

public class Tiger extends Animal{


    public Tiger(String breed, String color, String name, String size, char gender, int age) {
        super(breed, color, name, size, gender, age);
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
