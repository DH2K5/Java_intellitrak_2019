import java.util.Scanner;
import java.io.*;
public class Calculator 
{
    public static void main(String[] args) throws IOException
    {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sinp = new Scanner(System.in);
        while(true)
        {
            System.out.println("\f");
            System.out.println("\t\t\tCALCULATOR");
            System.out.println("1. Absolute Vaulue");
            System.out.println("2. Ceiling");
            System.out.println("3. Floor");
            System.out.println("4. Pow");
            System.out.println("5. Square Root");
            System.out.println("6. Exit");
            System.out.println("");
            System.out.print("Please enter your choice: ");
            int option = sinp.nextInt();
            if (option == 1)
            {
                System.out.print("Please enter the input: ");
                double input = sinp.nextDouble();
                double answer = Math.abs(input);
                System.out.print("the answer is" + answer);
                System.out.print("Press enter to continue");
                String x = br.readLine();
            }
            else if (option == 2)
            {
                System.out.print("Please enter the input: ");
                double input = sinp.nextDouble();
                double answer = Math.ceil(input);
                System.out.println("the answer is" + answer);
                System.out.print("Press enter to continue");
                String x = br.readLine();
            }
            else if (option == 3)
            {
                System.out.print("Please enter the input: ");
                double input = sinp.nextDouble();
                double answer = Math.floor(input);
                System.out.println("the answer is" + answer);
                System.out.print("Press enter to continue");
                String x = br.readLine();
            }
            else if (option == 4)
            {
                System.out.print("Please enter the first input: ");
                double input1 = sinp.nextInt();
                System.out.print("Please enter the second input: ");
                double input2 = sinp.nextInt();
                double answer = Math.pow(input1, input2);
                System.out.println("the answer is" + answer);
                System.out.print("Press enter to continue");
                String x = br.readLine();
            }
            else if (option == 5)
            {
                System.out.print("Please enter the first input: ");
                double input1 = sinp.nextInt();
                double answer = Math.sqrt(input1);
                System.out.println("the answer is" + answer);
                System.out.print("Press enter to continue");
                String x = br.readLine();
            }
            else if (option == 6)
            {
                break;
            }
            else
            {
                System.out.print("Invalid Input");
                String x = br.readLine();
            }
        }
    }
}
