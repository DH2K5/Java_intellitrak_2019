import java.util.ArrayList;
public class BankRunner
{
    public static void main(String args[])
    {
        System.out.println("\f");
        Bank obj;
        double bal;
        Bank acc1 = new Bank(112233, 9);
        Bank acc2 = new Bank(445566, 9000);
        Bank acc3 = new Bank(778899, 8);
        ArrayList<Bank> bankacc = new ArrayList<Bank>();
        bankacc.add(acc1);
        bankacc.add(acc2);
        bankacc.add(acc3);
        double accnoo = 0;
        double ball = 0;
        for (int i = 0; i < bankacc.size(); i ++)
        {
            obj = bankacc.get(i);
            bal = obj.getBalance();
            if ( bal > ball)
            {
                accnoo = obj.acno;
                ball = bal;
            }
        }
        System.out.println(accnoo);
    }
}
