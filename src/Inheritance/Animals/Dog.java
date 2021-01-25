package Inheritance.Animals;

public class Dog extends Animals {

    public Dog(String name, String breed, String color,String size,char gender, int age){
            setInfo(name,breed,color,size,gender,age);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
