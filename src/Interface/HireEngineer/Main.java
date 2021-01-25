package Interface.HireEngineer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        PcEngineer pcEngineer=new PcEngineer(false, true);

        System.out.println(pcEngineer);


        pcEngineer.ArmyStatus();
        pcEngineer.backgroudCheck();
        String[] str={"Tesla","Google","Amazon"};
        pcEngineer.Experiences(str);
    }
}
