import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);    //creates Scanner
            for (; ; ) {
            System.out.println("Player A:");    //acknowledges Player A
            System.out.print("Choose the move (R, P, S or r, p, s): ");  //Tells player A to input a move
            String a_choice = sc.next();   //reads into a_choice
            {


                    //if a_choice is not in R,P,S,r,p,s then it is not correct move
                    if (!(a_choice.equalsIgnoreCase("R") || a_choice.equalsIgnoreCase("P") || a_choice.equalsIgnoreCase("S"))) {
                        //System reads the incorrect move and terminates the game
                        System.out.println("You have not chosen correct move. Terminating the game...");
                        System.exit(0);   //and game will end
                    }
                    {
                        System.out.println("Player B:");   //displays Player B
                        System.out.print("Choose the move (R, P, S or r, p, s): ");  //prompts for the move of player B
                        String b_choice = sc.next();    //reads into b_choice
                        //if b_choice is not in R,P,S,r,p,s then it is not correct move
                        if (!(b_choice.equalsIgnoreCase("R") || b_choice.equalsIgnoreCase("P") || b_choice.equalsIgnoreCase("S"))) {
                            //displays that it is not correct move
                            System.out.println("You have not chosen correct move. Terminating the game...");
                            System.exit(0);      //and the game will end
                        }
                        for (; ; ) {
                            //if a chose r or R, b chose p or P, as paper covers the rock
                            if (a_choice.equalsIgnoreCase("R") && b_choice.equalsIgnoreCase("P"))
                                System.out.println("Player B wins");    //player B wins
                                //if a chose r or R, b chose s or S, as rock breaks scissors
                            else if (a_choice.equalsIgnoreCase("R") && b_choice.equalsIgnoreCase("S"))
                                System.out.println("Player A wins");   //player A wins
                                //if a chose p or P, b chose r or R, as paper covers the rock
                            else if (a_choice.equalsIgnoreCase("P") && b_choice.equalsIgnoreCase("R"))
                                System.out.println("Player A wins");   //player A wins
                                //if a chose p or P, b chose s or S
                            else if (a_choice.equalsIgnoreCase("P") && b_choice.equalsIgnoreCase("S"))
                                System.out.println("Player B wins");  //player B wins
                                //if a chose s or S, b chose r or R
                            else if (a_choice.equalsIgnoreCase("S") && b_choice.equalsIgnoreCase("R"))
                                System.out.println("Player B wins"); //player B wins
                                //if a chose s or S, b chose p or P
                            else if (a_choice.equalsIgnoreCase("S") && b_choice.equalsIgnoreCase("P"))
                                System.out.println("Player A wins");  //player A wins
                                //if a chose r or R, b chose r or R
                            else if (a_choice.equalsIgnoreCase("R"))
                                System.out.println("Rock vs Rock it's a Tie!");  //it will be a tie
                                //if a chose p or P, b chose p or P
                            else if (a_choice.equalsIgnoreCase("P"))
                                System.out.println("Paper vs paper it's a Tie!");  //it will be a tie
                            else    //if a chose s or S, b chose s or S
                                System.out.println("Scissors vs Scissors it's a Tie!");  //it will be a tie
                            System.out.println("Would you like to play another game Y/N ");
                            String newGame = sc.next();
                            if (newGame.equalsIgnoreCase("N"))
                            //Input for when player does not want to play again
                            {
                                System.out.println("Thank you for playing");
                            } else {
                                break;

                            }
                        }
                    }

                }
            }
        }
    }
}
