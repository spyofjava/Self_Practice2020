package Empty;

public class A {

    private String name ;
    private String lastName;

    public A(String name,String lastName){
        this.name=name;
        this.lastName = lastName;
    }

    public void methodA(){
        System.out.println("selam");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }







}
