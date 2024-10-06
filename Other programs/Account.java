public class Account
{
    public String name;
    public int balance;
    public static int count = 0;
    public static Account array[] = new Account[5];
    public Account(String who, int money)
    {
        name = who;
        balance = money;
        count ++;
        Account obj = new Account(who, money);
        array[count] = obj;
    }
    public static String highest()
    {
        int h = -1;
        String hs = "";
        Account obj;
        for (int i = 0; i < array.length; i++)
        {
            obj = array[i];
            if (obj.balance > h)
            {
                h = obj.balance;
                hs = obj.name;
            }
        }
        return hs;
    }
}
