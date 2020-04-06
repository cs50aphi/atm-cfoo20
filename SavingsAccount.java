// ATM(SavingsAccount) by Cheyenne Foo
public class SavingsAccount
{
    // Instance variables
    private double balance;

    // Constructors
    // default balance
    public SavingsAccount()
    {
        balance = 10.00;
    }
    // user specified starting balance
    public SavingsAccount(int b)
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
    public double interest(double rate)
    {
        // multiple current balance by interest rate
        balance = balance * rate;
        // return new balance
        return balance;
    }
}