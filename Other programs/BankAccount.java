public class BankAccount
{
    String name;
    int accno;
    double balance = 0;
    public BankAccount(String nn, int no)
    {
        name = nn;
        accno = no;
    }
    public int deposit(double money)
    {
        balance += money;
        return 0;
    }
}