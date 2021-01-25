package ReplitTasks.Replit_232_Overriding;

public class EducationalInstitution {

    private int years;

    public EducationalInstitution(int years){
        this.years=years;
    }


    public String graduationRequirements(){
        return years+" years of study";
    }



}
/*
Write a superclass, EducationalInstitution, that contains:
an int instance variable, duration, indicating the standard number
of years spent at the institution

A constructor that accepts an int which is used to initialize the duration
instance variable

a method graduationRequirements that returns a String. The (default) behavior
 of graduationRequirements is to return a String stating "d years of study",
  where d is the value of the duration instance variable
 */