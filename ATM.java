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
        String option;
        // repeat until user enters q or Q
        do
        {
            // present menu of options
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            option = kb.next();
            // which account for transaction
            int account = 0;
            // how much many in transaction
            double amount = 0;
            switch (option)
            {
                // if deposit
                case "d":
                case "D":
                    // ask which account
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    account = kb.nextInt();
                    // ask how much user wants to deposit
                    System.out.print("How many credits do you want to deposit? ");
                    // add amount to account
                    amount = kb.nextDouble();
                    if (account == 1)
                    {
                        checking.deposit(amount);
                    }
                    if (account == 2)
                    {
                        savings.deposit(amount);
                    }
                    // print balance of both accounts
                    accountBalance(checking, savings);
                    // add 1 to number of transactions
                    trans++;
                    break;
                // if withdraw
                case "w":
                case "W":
                    // ask which account
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    account = kb.nextInt();
                    // ask how much user wants to withdraw
                    System.out.print("How many credits do you want to withdraw? ");
                    amount = kb.nextDouble();
                    // check if enough in account
                    // subtract ammount from account
                    if (account == 1)
                    {
                        if (checking.checkBalance() >= amount)
                        {
                            checking.withdraw(amount);
                        }
                    }
                    if (account == 2)
                    {
                        if (savings.checkBalance() >= amount)
                        {
                            savings.withdraw(amount);
                        }
                    }
                    // print balance of both accounts
                    accountBalance(checking, savings);
                    // add 1 to number of transactions
                    trans++;
                    break;
                // if check balance
                case "c":
                case "C":
                    // print balance of both accounts
                    accountBalance(checking, savings);
                    // add 1 to number of transactions
                    trans++;
                    break;
                // if transfer
                case "t":
                case "T":
                    // ask checking to savings or vice versa
                    System.out.print("Transfer from: (1)Checking to Savings or (2)Savings to Checking? ");
                    account = kb.nextInt();
                    // ask how much
                    System.out.print("Amount to transfer? ");
                    amount = kb.nextDouble();
                    // check if enough in account
                    // if checking to savings
                    if (account == 1)
                    {
                        if (checking.checkBalance() >= amount)
                        {
                            // withdraw user amount from checking
                            checking.withdraw(amount);
                            // deposit user amount to savings
                            savings.deposit(amount);
                        }
                    }
                    // if savings to checking
                    if (account == 2)
                    {
                        if (savings.checkBalance() >= amount)
                        {
                            // withdraw user amount from savings
                            savings.withdraw(amount);
                            // deposit user amount to checkings
                            checking.deposit(amount);
                        }
                    }
                    // print balance of both accounts
                    accountBalance(checking, savings);
                    // add 1 to number of transactions
                    trans++;
                    break;
                // if quit
                case "q":
                case "Q":
                    // print balance of both accounts
                    accountBalance(checking, savings);
                    // say goodbye to user
                    System.out.println("Thank you for your business. Goodbye!");
                    // set quit to true
                    quit = true;
                    break;
            }
            // if # of transactions is a multiple of 5
            if (trans % 5 == 0 && !quit)
                {
                    // calculate interest
                    System.out.println("Interest calculated!");
                    savings.interest(10);
                    // print balance of both accounts
                    accountBalance(checking, savings);
                }
        } while (!quit);
    }
    // private helper class to print acccount balances
    private static void accountBalance(CheckingAccount checking, SavingsAccount savings)
    {
        // get balance from both accounts
        double check = checking.checkBalance();
        double save = savings.checkBalance();
        System.out.println("Your checking account has " + check + " credits.\n" + "Your savings account has " + save + " credits.\n");
    }
}