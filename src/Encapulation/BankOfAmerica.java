package Encapulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount("Sabiha","Uludag");

        bankAccount.setAccountHolder("Ibrahim uludag");
        bankAccount.setAccountNumber(876487234);
        bankAccount.setBalance(200000);
        System.out.println(BankAccount.bankName);
        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getAccountNumber());
        bankAccount.availableBalace();
        bankAccount.deposit(100000);
        bankAccount.availableBalace();
        bankAccount.withdrawal(200000);
        bankAccount.availableBalace();




    }
}
