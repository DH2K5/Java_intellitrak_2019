public class Bus
{
    private String driver;
    public String colour;
    public void setDriver(String driv)
    {
        driver = driv;
    }
    public String getDriver()
    {
        return driver;
    }
    Bus(String driv, String color)
    {
        driver = driv;
        colour = color;
    }
}
