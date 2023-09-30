import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        String player1 = "";
        String player2 = "";
        String trashP1 = "";
        String trashP2 = "";
        String anotherYN = "";

        do
        {

            System.out.print("Player 1 enter Rock [R], Paper [P], or Scissors [S]: ");
            trashP1 = in.nextLine();
            if(trashP1.equalsIgnoreCase("R") || trashP1.equalsIgnoreCase("P") || trashP1.equalsIgnoreCase("S"))
            {
                player1 = trashP1;
                in.nextLine();
                System.out.println("Player 2 enter Rock [R], Paper [P], or Scissors [S]: ");
                trashP2 = in.nextLine();
                if(trashP2.equalsIgnoreCase("R") || trashP2.equalsIgnoreCase("P") || trashP2.equalsIgnoreCase("S"))
                {
                    player2 = trashP2;
                    in.nextLine();
                    System.out.println(player2);

                }
                else
                {
                    System.out.println("You said: " + trashP2 + ".");
                    System.out.println("Please enter a valid input.");
                }
            }
            else
            {
                System.out.println("You said: " + trashP1 + ".");
                System.out.println("Please enter a valid input.");
            }

        }while(!done);
    }
}