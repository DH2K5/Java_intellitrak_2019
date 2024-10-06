public class Bank
{
    public static void main(String args[])
    {
        System.out.print("\f");
        ForiegnBank ha = new ForiegnBank("Ha", 1);
        IndianBank hu = new IndianBank("Hu", 2);
        hu.deposit(90000);
        ha.deposit(100000);
        int check = hu.withdraw(45000);
        if (check > 0)
        {
            System.out.println(hu.balance);
        }
        else
        {
            System.out.println("Unsuccessful");
        }
        check = ha.withdraw(10000);
        if (check > 0)
        {
            System.out.println(ha.balance);
        }
        else
        {
            System.out.println("Unsuccessful");
        }
        check = ha.withdraw(90000);
        if (check > 0)
        {
            System.out.println(ha.balance);
        }
        else
        {
            System.out.println("Unsuccessful");
        }
    }
}
