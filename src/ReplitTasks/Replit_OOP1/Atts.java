package ReplitTasks.Replit_OOP1;

public class Atts {

    public String name, color;
    public int amount;



    public String asString(){
        return ("name: "+name+" color: "+color+" amount: "+amount);
    }


}
/*
The class Atts holds a few attributes and has a method called asString.

the attributes are name and color -both are strings and amount which is an int.
their visibility is public.

asString returns a string showing all the Atts in a format.

Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());

prints:
name: table color: brown amount: 1

create the required attributes and method inside the atts class
 */