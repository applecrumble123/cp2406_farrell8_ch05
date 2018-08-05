import java.util.*;
public class CondoSales
{
    public static void main(String[] args)
    {
        int choice;
        Scanner input = new Scanner (System.in);
        System.out.println("Choose 1 for park view, 2 for golf course view or 3 for lake view: ");
        choice = input.nextInt();

        if (choice == 1)
        {
            System.out.println("The price is $150,000.");
        }
        else if (choice == 2)
        {
            System.out.println("The price is $170,000.");
        }
        else if (choice == 3)
        {
            System.out.println("The price is $210,000.");
        }
        else
        {
            System.out.println("The price is $0.");
        }
    }
}
