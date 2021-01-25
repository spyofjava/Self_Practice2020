package ReplitTasks.Replit_232_Overriding;

public class LawSchool extends EducationalInstitution {

    public LawSchool() {
        super(3);
    }


    public String graduationRequirements(){
        return super.graduationRequirements()+" and passing the bar";
    }



}
/*
Write a subclass LawSchool that contains:
a (default) constructor (No-Arg) that invokes the superclass constructor with the value 3
(law school is typically a three year program).

a (overridden) method graduationRequirements that returns the string "3 years of study and passing
 the bar". You MUST invoke the graduationRequirements
 method of the superclass in this method
 (to obtain the first portion of the resulting string).
 */