package Constructors.exercise;

public class person {
    public String name;
    final String lastname;
    private int age;

    public person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public void getAge(){
        System.out.println(age);
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }


}
