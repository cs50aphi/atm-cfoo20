// ATM by Cheyenne Foo
import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // Initiate Scanner
        Scanner kb = new Scanner(System.in);
        // Create new accounts
        CheckingAccount checking = new CheckingAccount(15);
        SavingsAccount savings = new SavingsAccount(100);
        // Greet user
        System.out.println("Greetings and how may I serve you?");
        // Set quit to false
        boolean quit = false;
        // count # of transactions
        int trans = 0;
        // repeat until user enters q or Q
        do
        {
            // present menu of options
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit?");
            String option = kb.nextLine();
            switch (option)
            {
                // if deposit
                case "d":
                case "D":
                    // ask which account
                    System.out.print("Deposit to: (1)Checking or (2)Savings?");
                    int account = kb.nextInt();
                    // ask how much user wants to deposit
                    System.out.print("How many credits do you want to deposit?");
                    // add amount to account
                    double amount = kb.nextDouble();
                    if (account == 1)
                    {
                        double newBalance = checking.deposit(amount);
                    }
                    if (account == 2)
                    {
                        double newBalance = savings.deposit(amount);
                    }
                    // print balance of both accounts
                    System.out.println(accountBalance);
                    // add 1 to number of transactions
                    trans++;
                // if withdraw
                    // ask which account
                    // ask how much user wants to withdraw
                    // subtract ammount from account
                    // print balance of both accounts
                    // add 1 to number of transactions
                // if check balance
                    // print balance of both accounts
                    // add 1 to number of transactions
                // if transfer
                    // ask checking to savings or vice versa
                    // ask how much
                    // if checking to savings
                        // withdraw user amount from checking
                        // deposit user amount to savings
                    // if savings to checking
                        // withdraw user amount from savings
                        // deposit user amount to checkings
                    // print balance of both accounts
                    // add 1 to number of transactions
                // if # of transactions is a multiple of 5
                    // calculate interest
                    // print balance of both accounts
                // if quit
                case "q":
                case "Q":
                    // set quit to true
                    quit = true;
            }
        } while (!quit);
    }
    // private helper class to print acccount balances
    private String accountBalance()
    {
        // get balance from both accounts
        double check = checking.checkBalance();
        double save = savings.checkBalance();
        String end = "Your checking account has " + check + " credits.\n" + "Your savings account has " + save + "credits.\n";
        return end;
    }
}