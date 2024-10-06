public abstract class Employee
{
    private String name;
    private int number;
    public Employee(String name, int number)
    {
        System.out.println("Constructing an employee");
        this.name = name;
        this.number = number;
    }
    public double computePay()
    {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public String getName()
    {
        return name;
    }
}