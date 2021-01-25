package ReplitTasks.Replit_228;

public class Main {

    public static void main(String[] args) {


        GasTank gasTank=new GasTank(20);
        gasTank.addGas(5);
        gasTank.addGas(5);
        gasTank.addGas(5);
        gasTank.addGas(5);
        gasTank.useGas(30);
        gasTank.addGas(35);
        System.out.println(gasTank.isEmpty());
        System.out.println(gasTank.isFull());
        System.out.println(gasTank.getGasLevel());

    }

}
