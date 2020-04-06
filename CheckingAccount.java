// ATM(CheckingAccount) by Cheyenne Foo
public class CheckingAccount
{
    // Instance variables
    private double balance;

    // Constructors
    // default balance
    public CheckingAccount()
    {
        balance = 10.00;
    }
    // user specified starting balance
    public CheckingAccount(int b)
    {
        balance = b;
    }

    // Methods
    // check balance
    public double checkBalance()
    {
        // return amount in Checking Account
        return balance;
    }
    // withdraw
    public double withdraw(double amount)
    {
        // take user input
        // substract input from total balance
        balance = balance - amount;
        // return new balance
        return balance;
    }
    // deposit
    public double deposit(double amount)
    {
        // take user input
        // add input to balance
        balance = balance + amount;
        // return new balance
        return balance;
    }
}