
import java.util.*;
public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        Integer[] num = new Integer[3];
        Scanner input = new Scanner (System.in);
        for (int i = 0; i<3; i++)
        {
            System.out.println("Enter a number: ");
            num[i] = input.nextInt();
        }

        System.out.println("Ascending order >> ");
        Arrays.sort(num);
        for (int value : num)
            System.out.println(value);

        System.out.println("Descending order >> ");
        Arrays.sort(num, Collections.reverseOrder()); // sort in reverse order
        for (int value : num)
            System.out.println(value);













    }
}
