package Inheritance.AnimalTask;

public class Animal {
//------------------- this class is A parent Class that give to the child his all of variables, methods etc...----------------
    public String breed, color, name, size;
    public char gender;
    public int age;

    public Animal(String breed, String color, String name, String size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(name+" is drinking "+drinks);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
