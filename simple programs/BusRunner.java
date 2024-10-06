public class BusRunner
{
    public static void main(String[] args)
    {
        Bus bus = new Bus("Klang", "red");
        bus.setDriver("Wang");
        System.out.println(bus.getDriver());
    }
}
