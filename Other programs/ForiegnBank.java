public class ForiegnBank extends BankAccount
{
    public ForiegnBank(String nn, int no)
    {
        super(nn, no);
    }
    public int withdraw(double money)
    {
        if ((money > 80000) && (money > balance))
        {
            return -1;
        }
        balance -= money;
        return 1;
    }
}
