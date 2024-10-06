public class recursion
{
    public static int ifact(int num)
    {
        int prod = 1;
        for (int i = 1; i <= num; i++)
        {
            prod *= i;
        }
        return prod;
    }
    public static int rfact(int num)
    {
        if (num == 1)
        {
            return 1;
        }
        return num * rfact(num - 1);
    }
    public static int rfibo(int num)
    {
        if (num == 1 || num == 2)
        {
            return 1;
        }
        return rfibo(num - 1) + rfibo(num - 2);
    }
}
