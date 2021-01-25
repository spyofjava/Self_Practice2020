package Inheritance.Animals;

public class Cat extends Animals {

    public Cat(String name, String breed, String color, String size, char gender, int age){
        setInfo(name,breed,color,size,gender,age);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
