package account;

public class BankAccount {
    private String number;
    private String cardHolder;
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Amount is invalid");
        } else {
            balance = balance + amount;
            System.out.println("Deposit $" + amount + ", current balance is $" + balance);
        }
    }

    void withdraw(double amount) {
        if(amount <= 0 || amount > balance) {
            System.out.println("Amount is invalid");
            return;
        } else {
            balance = balance - amount;
            System.out.println("Withdraw $" + amount + ", current balance is $" + balance);
        }
    }
}
