package account;

public class BankAccountUse {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setNumber("1234");
        account.setCardHolder("Mary");
        account.setBalance(100);

        account.deposit(150);
        account.withdraw(60);
    }
}
