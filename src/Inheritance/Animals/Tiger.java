package Inheritance.Animals;

public class Tiger extends Animals {

    public Tiger(String name, String breed, String color, String size, char gender, int age){
        setInfo(name,breed,color,size,gender,age);
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
