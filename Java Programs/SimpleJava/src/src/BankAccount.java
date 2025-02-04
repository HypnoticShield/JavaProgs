package src;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
    public static void main(){
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        account.checkBalance();
    }
}


