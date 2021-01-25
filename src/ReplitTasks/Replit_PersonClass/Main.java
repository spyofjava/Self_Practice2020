package ReplitTasks.Replit_PersonClass;

public class Main {

    public static void main(String[] args) {
        Person Person =new Person("ibrahim", "uludag", 05,29,1983,"088956836");
        System.out.println(Person.getBirthday());
        System.out.println(Person.verifySSN("088956836"));

    }
}
