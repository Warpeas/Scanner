
public class Account {
    // instance variable that stores the balance private
    double balance;
    
    // constructor
    public Account(double initialBalance) {
        // if initialBalance is not greater than 0.0
        // balance is initialized to the default value 0.0
        if (initialBalance > 0.0) balance = initialBalance;
    }
    
    // add an amount to the account
    public void credit(double amount) {
        balance += amount;
    }
    
    // return the account balance
    public double getBalance() {
        return balance;
    }
}
