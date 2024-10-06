public class Mammal implements Animal
{
    public void eat()
    {
        System.out.println("Eats");
    }
    public void drink()
    {
        System.out.println("Drinks");
    }
    public void talk()
    {
        System.out.println("talks");
    }
    public void die()
    {
        System.out.println("dies");
        System.out.println("Roblix oooooooffffff sound plays");
    }
    public void move()
    {
        for(int i = 0; i < 1000000000; i ++)
        {
            System.out.println("System crashes");
            System.out.println("crash report: " + (39446474 + i));
        }
    }
}