package ReplitTasks.Replit_Pizza;

public class Pizza {

    private String size;
    private int numOfCheeseToppings;
    private int numOfPepperoniToppings;
    private int numOfHamToppings;

    public Pizza(String size, int numOfCheseToppings, int numOfPepperoniToppings,int numOfHamToppings){
        this.size = size;
        this.numOfCheeseToppings=numOfCheseToppings;
        this.numOfPepperoniToppings=numOfPepperoniToppings;
        this.numOfHamToppings=numOfHamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheseToppings() {
        return numOfCheeseToppings;
    }

    public void setNumOfCheseToppings(int numOfCheseToppings) {
        this.numOfCheeseToppings = numOfCheseToppings;
    }

    public int getNumOfPepperoniToppings() {
        return numOfPepperoniToppings;
    }

    public void setNumOfPepperoniToppings(int numOfPepperoniToppings) {
        this.numOfPepperoniToppings = numOfPepperoniToppings;
    }

    public int getNumOfHamToppings() {
        return numOfHamToppings;
    }

    public void setNumOfHamToppings(int numOfHamToppings) {
        this.numOfHamToppings = numOfHamToppings;
    }

    public double calCost(){
        double cost=0;
        int totalToppings=numOfCheeseToppings+numOfPepperoniToppings+numOfHamToppings;
        if (size.equalsIgnoreCase("small")){
            cost=10+(2*totalToppings);
        }else if (size.equalsIgnoreCase("Medium")){
            cost=12+(2*totalToppings);
        }else if (size.equalsIgnoreCase("large")){
            cost=14;
            cost+=(2*totalToppings);

        }
        return cost;
    }

    public String getDescription(){
        return (size+" Pizza with "+numOfCheeseToppings+" Cheese toppings, "+numOfPepperoniToppings+" Pepperoni toppings, "+"and "+numOfHamToppings +" Ham toppings."+"\nTotal Price: "+calCost());
    }
}