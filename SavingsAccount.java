// ATM(SavingsAccount) by Cheyenne Foo
public class SavingsAccount
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
    }
    // withdraw
    public double withdraw()
    {
        // take user input
        // substract input from total balance
        // return new balance
    }
    // deposit
    public double deposit()
    {
        // take user input
        // add input to balance
        // return new balance
    }
    public double interest()
    {
        // multiple current balance by interest rate
        // return new balance
    }
}