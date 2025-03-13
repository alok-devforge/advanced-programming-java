import java.util.*;
class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: Rs" + amount + " | New balance: Rs" + balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (balance - amount < 0) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw Rs" + amount + " from current balance of Rs" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs" + amount + " | New balance: Rs" + balance);
    }
    public double getBalance()
    {
        return balance;
    }
}
public class A_BankingExcept
{
    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        BankAccount account = new BankAccount(500.0);
        System.out.println("Initial balance: Rs" + account.getBalance());
        System.out.print("Enter amount to withdraw: ");
        double amount = ob.nextDouble();
        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Final balance: Rs" + account.getBalance());
        }
    }
}