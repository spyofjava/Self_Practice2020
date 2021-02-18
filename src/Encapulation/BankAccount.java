package Encapulation;

///-------------This topic review how to reach type of Private variable-------------
public class BankAccount {

    public final static String bankName = "Bank Of America";// this can not be changed anymore

    public String firstName, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    //------------constructor------------------

    public BankAccount(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName= lastName;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount){
        if (balance < amount){
            System.out.println("Invalid amount "+amount);
        }else {
            System.out.println("Depositing $"+amount+" to "+accountNumber);
            setBalance(balance+amount);
        }
    }

    public  void withdrawal(double amount){
        if (balance < amount){
            System.out.println("Invalid amount "+amount);
            System.out.println("Available balance "+balance);
        }else {
            System.out.println("withdrawing $"+amount+" from "+accountNumber);
            setBalance(balance-amount);
        }

    }

    public void availableBalace(){
        System.out.println("Available balance of the "+getAccountNumber()+" is $"+getBalance());
    }


}
