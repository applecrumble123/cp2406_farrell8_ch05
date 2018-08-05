import java.util.*;
public class CondoSales2
{
    public static void main(String[] args)
    {
        int choice;
        int nextChoice;
        Scanner input = new Scanner (System.in);
        System.out.println("Choose 1 for park view, 2 for golf course view or 3 for lake view: ");
        choice = input.nextInt();
        System.out.println("Choose 1 garage, 2 for parking space: ");
        nextChoice = input.nextInt();

        if (choice == 1 && nextChoice == 1)
        {
            System.out.println("The price is $155,000.");
        }
        else if (choice == 2 && nextChoice == 1)
        {
            System.out.println("The price is $175,000.");
        }
        else if (choice == 3 && nextChoice == 1)
        {
            System.out.println("The price is $215,000.");
        }
        else
        {
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
}
