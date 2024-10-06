public class IndianBank extends BankAccount
{
    public IndianBank(String nn, int no)
    {
        super(nn, no);
    }
    public int withdraw(double money)
    {
        if ((money > 30000) && (money > balance))
        {
            return -1;
        }
        balance -= money;
        return 1;
    }
    public int deposit(double money)
    {
        if (money < 6)
        {
            return -1;
        }
        balance += money;
        return 1;
    }
}
