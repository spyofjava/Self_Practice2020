package ReplitTasks.Replit_Stock;

public class Main {

    public static void main(String[] args) {

        Stock stock =new Stock("goog", "Google, Inc", 802, 1000000);
        stock.adjustPrice(900);
        System.out.println(stock);
        System.out.println(stock.percentChange);


    }
}
