import java.util.*;
public class PastPresentFuture
{
    public static void main(String[] args)
    {
        int day;
        int month;
        int year;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter day: ");
        day = input.nextInt();

        System.out.println("Enter month: ");
        month = input.nextInt();

        System.out.println("Enter year: ");
        year = input.nextInt();

        if (month != 8 && year != 2018)
        {
            System.out.println("It is not this year.");
        }
        else if (month < 8 && year == 2018)
        {
            System.out.println("It is an earlier month, this year.");
        }

        else if (month > 8 && year == 2018)
        {
            System.out.println("It is a later month, this year.");
        }

        else if (month == 8 && year == 2018)
        {
            System.out.println("It is a this month, this year.");
        }
    }
}
