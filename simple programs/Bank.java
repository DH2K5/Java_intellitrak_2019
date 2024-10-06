public class Bank
{
    public double acno;
    private double balance;
    public Bank(double no, double b)
    {
        acno = no;
        balance = b;
    }
    public double getBalance()
    {
        return balance;
    }
}
