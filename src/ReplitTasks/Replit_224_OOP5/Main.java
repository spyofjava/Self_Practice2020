package ReplitTasks.Replit_224_OOP5;

public class Main {
    public static void main(String[] args) {


        Person person1=new Person("ali","veli",22);
        System.out.println(person1);

        Person person2=new Person();
        System.out.println(person2.getFirstName());
        person1.getFirstName();
        person1.toString();
        person1.setAge(12);
        person2.getAge();
        person2.getFirstName();
        person2.getLastName();
        person1.setLastName("Uludag");
        person1.setInfo("aixily", "xiomi",32 );
        person2.setAge(22);
        person2.toString();
        person1.setLastName("Martin");
        person2.setLastName("Gowest");
        person1.setAge(25);
    }
}
