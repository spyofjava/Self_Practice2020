package Abstraction.HireEngineer;

public class PcEngineer implements RequirementEngineer {

    public boolean army=true;
    public boolean background=true;

    public PcEngineer(boolean army, boolean background) {
        this.army = army;
        this.background = background;
    }

    @Override
    public void ArmyStatus() {
        if (army){
            System.out.println("I did my army service");
        }else {
            System.out.println("I did not my army service");
        }
    }

    @Override
    public void backgroudCheck() {

        if (true){
            System.out.println("I have a crime report");
        }else {
            System.out.println("I don't have any crime report");
        }
    }

    @Override
    public String GP(double average) {
        return "My Average is "+average;
    }

    @Override
    public void Experiences(String[] arr) {
        System.out.println("I worked these companies: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public String toString() {
        return "PcEngineer{" +
                "army=" + army +
                ", background=" + background +
                '}';
    }
}
