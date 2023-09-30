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
                System.out.println("Player 2 enter Rock [R], Paper [P], or Scissors [S]: ");
                trashP2 = in.nextLine();

                if(trashP2.equalsIgnoreCase("R") || trashP2.equalsIgnoreCase("P") || trashP2.equalsIgnoreCase("S"))
                {
                    player2 = trashP2;

                    //Player 1 Rock

                    if(player1.equalsIgnoreCase("R"))
                    {
                        if(player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("Rock vs. Rock! It's a TIE!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Paper covers Rock! Player 2 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("Rock breaks Scissors! Player 1 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }

                    //Player 1 Paper

                    else if(player1.equalsIgnoreCase("P"))
                    {
                        if(player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("Paper covers Rock! Player 1 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Paper vs. Paper! It's a TIE!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("Scissors cuts Paper! Player 2 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }

                    //Player 1 Scissors

                    else if(player1.equalsIgnoreCase("S"))
                    {
                        if(player2.equalsIgnoreCase("R"))
                        {
                            System.out.println("Rock breaks Scissors! Player 2 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Scissors cuts Paper! Player 1 WINS!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else if(player2.equalsIgnoreCase("S"))
                        {
                            System.out.println("Scissors vs. Scissors! It's a TIE!");
                            System.out.println("Do you want to play again? [Y/N]: ");
                            anotherYN = in.nextLine();
                            if(anotherYN.equalsIgnoreCase("N"))
                            {
                                System.out.println("Thank you for playing!");
                                done = true;
                            }
                        }
                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }
                    else
                    {
                        System.out.println("Please enter a valid input.");
                    }

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