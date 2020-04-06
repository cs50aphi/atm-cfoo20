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
    public void withdraw(double amount)
    {
        // take user input
        // substract input from total balance
        balance = balance - amount;
    }
    // deposit
    public void deposit(double amount)
    {
        // take user input
        // add input to balance
        balance = balance + amount;
    }
    public void interest(double rate)
    {
        // multiple current balance by interest rate
        balance = balance * (100 + rate / 100);
    }
}