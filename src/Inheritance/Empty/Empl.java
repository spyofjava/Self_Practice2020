package Inheritance.Empty;

public class Empl {

    public String firstname, lastname;
    public int ID;

    public void setInfo(String firstname,String lastname,int ID){
        this.firstname=firstname;
        this.lastname=lastname;
        this.ID=ID;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ID=" + ID +
                '}';
    }
}
