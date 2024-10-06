import java.util.Scanner;
public class HotelSystemProject
{
    public static void main (String args[])
    {
        System.out.println("\f");
        Scanner sinp = new Scanner(System.in);
        int[][] rooms = {{101, 102, 103, 104, 105, 106, 107, 108, 109, 110}, {201, 202, 203, 204, 205, 206, 207, 208, 209, 210}, {301, 302, 303, 304, 305, 306, 307, 308, 309, 310}};
        char[][] avail = {{'A', 'X', 'A', 'X', 'X', 'A', 'A', 'A', 'A', 'A'}, {'A', 'X', 'A', 'X', 'X', 'X', 'X', 'X', 'A', 'A'}, {'X', 'X', 'X', 'A', 'A', 'X', 'X', 'X', 'A', 'A'}};
        for (int i = 0; i < 1000000000; i=i)
        {
            System.out.println("1. Show available rooms");
            System.out.println("2. Show unavailable rooms");
            System.out.println("3. Reserve");
            System.out.println("4. Quit");
            System.out.print("Please enter the option number of your choice: ");
            int option = sinp.nextInt();
            if (option == 1)
            {
                showRooms(rooms, avail, 'A');
            }
            else if (option == 2)
            {
                showRooms(rooms, avail, 'X');
            }
            else if (option == 3)
            {
                System.out.print("Please enter the room number: ");
                int room = sinp.nextInt();
                reserve(rooms, avail, room);
            }
            else if (option == 4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }
    private static void showRooms(int[][] rooms, char[][] avail, char what)
    {
        for (int i = 0; i < avail.length; i++)
        {
            for (int j = 0; j < avail[i].length; j++)
            {
                if (avail[i][j] == what)
                {
                    System.out.print(rooms[i][j] + " ");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
    private static boolean reserve(int[][] rooms, char[][] avail, int room)
    {
        for (int i = 0; i < rooms.length; i++)
        {
            for (int j = 0; j < rooms[i].length; j++)
            {
                if (rooms[i][j] == room)
                {
                    if (avail[i][j] == 'A')
                    {
                        avail[i][j] = 'X';
                        System.out.println("The room has been succesfully reserved");
                        return true;
                    }
                    else
                    {
                        System.out.println("The room is taken");
                        return false;
                    }
                }
            }
        }
        System.out.println("The room does not exist");
        return false;
    }
}
