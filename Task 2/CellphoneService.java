import java.util.*;
public class CellphoneService
{
    public static void main(String[] args)
    {
        int talkMinutes;
        int numOfTextMessages;
        int dataUsed;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter monthly talk minutes: ");
        talkMinutes = input.nextInt();

        System.out.println("Enter monthly text messages sent: ");
        numOfTextMessages = input.nextInt();

        System.out.println("Enter monthly data used in GB: ");
        dataUsed = input.nextInt();

        if (talkMinutes < 500 && numOfTextMessages ==0 && dataUsed ==0)
        {
            System.out.println("Plan A, which cost $49, is recommended.");
        }
        else if (talkMinutes < 500 && numOfTextMessages > 0 && dataUsed ==0)
        {
            System.out.println("Plan B, which cost $55, is recommended.");
        }
        else if (talkMinutes > 500 && numOfTextMessages < 100 && dataUsed ==0)
        {
            System.out.println("Plan C, which cost $61, is recommended.");
        }

        else if (talkMinutes > 500 && numOfTextMessages > 100 && dataUsed ==0)
        {
            System.out.println("Plan D, which cost $70, is recommended.");
        }

        else if (talkMinutes > 0 && numOfTextMessages > 0 && dataUsed < 2)
        {
            System.out.println("Plan E, which cost $79, is recommended.");
        }

        else if (talkMinutes > 0 && numOfTextMessages > 0 && dataUsed > 2)
        {
            System.out.println("Plan F, which cost $87, is recommended.");
        }
    }
}
