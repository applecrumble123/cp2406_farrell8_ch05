import java.time.LocalDate;
import java.util.*;
import java.lang.*;
public class PastPresentFuture2
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

        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(2018, 8, 5);

        if (date1.isBefore(date2))
        {
            System.out.println("It is the past.");
        }
        else if (date1.isAfter(date2))
        {
            System.out.println("It is the future.");
        }
        else if (date1.isEqual(date2))
        {
            System.out.println("It is the present.");
        }
    }
}
