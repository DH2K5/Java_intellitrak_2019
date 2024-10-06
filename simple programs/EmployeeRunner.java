public class EmployeeRunner
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee(1000, 10, 100);
        double money = emp1.calcTakeHome();
        System.out.println(money);
    }
}
