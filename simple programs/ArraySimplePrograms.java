import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class ArraySimplePrograms
{
    public static void unknownArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How lng should the array be: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Please enter the numbers inside the array: ");
            array[i] = scanner.nextInt();
        }
        arrayprinter(array);
    }
    private static void ArrayList()
    {
        System.out.println("\f");
        ArrayList<String> array = new ArrayList<String>();
        array.add("Number 1");
        array.add("Number 2");
        array.add("Number 3");
        array.add(2, "Number 4");
        array.add(0, "Number 5");
        array.add(5, "Number 6");
        int position = array.indexOf("Number 5");
        boolean emptiness = array.isEmpty();
        int size = array.size();
        boolean contains = array.contains("Number 7575757575757575");
        System.out.println(array);
        System.out.println(position);
        System.out.println(emptiness);
        System.out.println(size);
        System.out.println(contains);
    }
    public static void main(String args[])
    {
        System.out.println("\f");
        int[] array = {1, 4, 3, 5, 2, 8, 7, 9, 6, 0};
        insertionSorting(array);
        arrayprinter(array);
    }
    private static int[][] twodarraydoubler(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] *= 2;
            }
        }
        return array;
    }
    private static int[] twodarrayrowsummer(int[][] array)
    {
        int sum;
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            sum = 0;
            for (int j = 0; j < array[i].length; j++)
            {
                sum += array[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }
    private static int twodarraysummer(int[][] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += arraysummer(array[i]);
        }
        return sum;
    }
    private static int arraysummer(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
    private static int[][] arrayzerodiagonal(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i][i] = 0;
        }
        return array;
    }
    private static void twodarrayprinter(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void arrayprinter(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    private static int arraynumsofwordsearcher(String[] array, int words)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].length() == words)
            {
                count ++;
            }
        }
        return count;
    }
    public static void arraylistreverse()
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(2, 4);
        array.add(0, 5);
        array.add(5, 6);
        for (int i = (array.size() - 1); i >= 0; i --)
        {
            array2.add(array.get(i));
        }
        System.out.println(array);
        System.out.println(array2);
    }
    private static int[] selectionSorting(int[] array)
    {
        int i;
        int j;
        int s;
        int min;
        for(j = 0; j < array.length; j ++)
        {
            min = j;
            for(i = j + 1; i < array.length; i ++)
            {
                if (array[i] < array[min])
                {
                    min = i;
                }
            }
            if (min != j)
            {
                s = array[j];
                array[j] = array[min];
                array[min] = s;
            }
        }
        return array;
    }
    private static int binarySearch(int[] array, int find)
    {
        array = selectionSorting(array);
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while(first <= last)
        {
            if (array[middle] < find)
            {
                first = middle + 1;
            }
            else if (array[middle] == find)
            {
                return middle;
            }
            else if (array[middle] > find)
            {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }
    private static int[] insertionSorting(int[] array)
    {
        int v;
        int j;
        for (int i = 1; i < array.length; i ++)
        {
            v = array[i];
            j = i;
            while (j > 0 && array[j - 1] > v)
            {
                array[j] = array[j - 1];
                j --;
            }
            array[j] = v;
        }
        return array;
    }
}