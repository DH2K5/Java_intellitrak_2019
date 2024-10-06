public class Currency
{
    private String fromCurrency = "not specified"; //encapsulation
    private String toCurrency = "not specified"; //it belongs to the object
    private double factor = 0;
    private static int exchanges = 0; //it belongs to the class
    Currency(String fromCurrencyP, String toCurrencyP, double factorP) //it runs when object is created and called a constructor
    {
        fromCurrency = fromCurrencyP;
        toCurrency = toCurrencyP;
        factor = factorP;
        exchanges ++;
    }
    String ToString() //runned when object is printed
    {
        String toPrint = printReport(0);
        return toPrint;
    }
    public String convert(double money)
    {
        double mon = money * factor;
        String statement = printReport(mon);
        return statement;
    }
    public String printReport(double ans)
    {
        String prints = fromCurrency + " has been converted to " + toCurrency + ": " + ans;
        return prints;
    }
    public String getFromCurrency() //an accessor to access the private attributes
    {
        return fromCurrency;
    }
    public String getToCurrency()
    {
        return toCurrency;
    }
    public double getFactor()
    {
        return factor;
    }
    public static int getNunberOfObjects()
    {
        return exchanges;
    }
    public void setFromCurrency(String fc) //a setter to set the private attributes
    {
        fromCurrency = fc;
    }
    public void setToCurrency(String tc)
    {
        toCurrency = tc;
    }
    public void setFactor(double fac)
    {
        factor = fac;
    }
}