public class Salary extends Employee
{
    public Salary(String name, int number)
    {
        super(name, number);
    }
    public void mailCheck()
    {
        System.out.println("Within mailCheck of Salary Class");
        System.out.println("Mailing check to" + getName());
    }
}