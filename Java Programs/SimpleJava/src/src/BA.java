package src;

public class BA {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        account.checkBalance();
    }
}
