public class CurrencyRunner
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        String from = "dollers";
        String to = "rupees";
        double factor = 71;
        Currency convertion = new Currency(from, to, factor);
        String toPrint = convertion.convert(180);
        System.out.println(toPrint);
    }
}
