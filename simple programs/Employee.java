public class Employee
{
    static double gross;
    static double tax;
    static double deductions;
    Employee(double grosss, double taxx, double deductionss)
    {
        gross = grosss;
        tax = taxx;
        deductions = deductionss;
    }
    public double calcTakeHome()
    {
        double money = gross - tax - deductions;
        return money;
    }
}
