import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        boolean done = false;
        boolean doneMoveA = false;
        boolean doneMoveB = false;
        Scanner in = new Scanner(System.in);
        String player1 = "";
        String player2 = "";
        String trashP1 = "";
        String trashP2 = "";
        String anotherYN = "";

        do
        {

            do
            {

                System.out.print("Player 1 enter Rock [R], Paper [P], or Scissors [S]: ");
                trashP1 = in.nextLine();

                if (trashP1.equalsIgnoreCase("R") || trashP1.equalsIgnoreCase("P") || trashP1.equalsIgnoreCase("S"))
                {
                    player1 = trashP1;
                    doneMoveA = true;
                }
                else
                {
                    System.out.println("You said: " + trashP1 + ".");
                    System.out.println("Please enter a valid input.");
                }
            }while(!doneMoveA);

            do
            {
                System.out.println("Player 2 enter Rock [R], Paper [P], or Scissors [S]: ");
                trashP2 = in.nextLine();

                if(trashP2.equalsIgnoreCase("R") || trashP2.equalsIgnoreCase("P") || trashP2.equalsIgnoreCase("S"))
                {
                    player2 = trashP2;
                    doneMoveB = true;
                }
                else
                {
                    System.out.println("You said: " + trashP2 + ".");
                    System.out.println("Please enter a valid input.");
                }

            }while(!doneMoveB);

                    //Player 1 Rock

                    if(player1.equalsIgnoreCase("R"))
                    {

                        //Player 2 Rock

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

                        //Player 2 Paper

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

                        //Player 2 Scissors

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

                        //Something broke

                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }

                    //Player 1 Paper

                    else if(player1.equalsIgnoreCase("P"))
                    {

                        //Player 2 Rock

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

                        //Player 2 Paper

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

                        //Player 2 Scissors

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

                        //Something Broke

                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }

                    //Player 1 Scissors

                    else if(player1.equalsIgnoreCase("S"))
                    {

                        //Player 2 Rock

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

                        //Player 2 Paper

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

                        //Player 2 Scissors

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

                        //Something Broke

                        else
                        {
                            System.out.println("Please enter a valid input.");
                        }
                    }
                    else
                    {
                        System.out.println("Please enter a valid input.");
                    }




        }while(!done);
    }
}