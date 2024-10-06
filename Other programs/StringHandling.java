public class StringHandling
{
    public static void main(String args[])
    {
        print(removeWord("My Palm Retreat", "Palm"));
    }
    private static void print(String str)
    {
        System.out.println(str);
    }
    private static String removeWord(String str1, String str2)
    {
        String strr = str1;
        if (str1.indexOf(str2) > -1)
        {
            strr = str1.substring(0, str1.indexOf(str2));
            strr = strr + str1.substring(str1.indexOf(str2) + str2.length());
        }
        return strr;
    }
}
