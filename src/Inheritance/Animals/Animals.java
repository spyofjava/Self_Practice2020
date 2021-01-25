package Inheritance.Animals;

public class Animals {
    public String name , breed, color,size;
    public char gender;
    public int age;

    public void setInfo(String name, String breed, String color, String size, char gender, int age){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.size=size;
        this.gender=gender;
        this.age=age;
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
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
