/*******************************************************************
* Proj3.java
* <Alex Masson / Section B/ Thursday 4:30 - 6:30>
*
* This program is a game of pig featuring 2 player, 1 player, and simulation
*
*The logic behind my computers game plan is the simple fact that playing slow and safe is far better than risking it all to win.
*While my computer will most definently take longer to win than other computers,
*it wins often, and that is why I chose to make it very simple and very safe.
*******************************************************************/

import java.util.*;

public class Proj3{
  public static void main(String[] args){

    int stage = 1;
    int player1TurnScore = 0;
    int player1TotalScore = 0;
    int player2TurnScore = 0;
    int player2TotalScore = 0;
    int computer1TurnScore = 0;
    int computer1TotalScore = 0;
    int computer2TurnScore = 0;
    int computer2TotalScore = 0;
    int dice;
    final int WINNINGSCORE = 20; //here you go
    String input;
    boolean player1 = true;
    boolean player2 = false;
    boolean computer1 = false;
    boolean computer2 = false;
    int computer1TurnCount = 0;
    int counter = 0;
    int winCount = 0;
    //boolean computer2 = false;

    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    switch (stage) {

    case 1:

              while(player1TotalScore < WINNINGSCORE && player2TotalScore < WINNINGSCORE){

                if(player1 == true){
                System.out.print("Player 1 turn total is " + player1TurnScore + ". Enter (r)oll or (s)top:");
                input = in.nextLine();

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("You rolled a " + dice);
                    System.out.println("");
                    player1TurnScore = player1TurnScore + dice;
                  } else {
                    player1 = false;
                    player2 = true;
                    player1TurnScore = 0;
                    System.out.println("You rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Player 2 has " + player2TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  player1TotalScore = player1TotalScore + player1TurnScore;
                  player1TurnScore = 0;
                  player1 = false;
                  player2 = true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Player 2 has " + player2TotalScore);
                  System.out.println("");
                }//end score if
              }else if(player2 == true){

                System.out.print("Player 2 turn total is " + player2TurnScore + ". Enter (r)oll or (s)top:");
                input = in.nextLine();

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("You rolled a " + dice);
                    System.out.println("");
                    player2TurnScore = player2TurnScore + dice;
                  } else {
                    player2 = false;
                    player1 = true;
                    player2TurnScore = 0;
                    System.out.println("You rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Player 2 has " + player2TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  player2TotalScore = player2TotalScore + player2TurnScore;
                  player2TurnScore = 0;
                  player2 = false;
                  player1 = true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Player 2 has " + player2TotalScore);
                  System.out.println("");
                }//end score if

              }//end score if



              }//end main while

              if(player1TotalScore >= WINNINGSCORE || player2TotalScore >= WINNINGSCORE){

                if(player1TotalScore >= WINNINGSCORE){
                  dice = 0;
                  System.out.println("Player 1 wins");
                  System.out.println("");
                  System.out.print("Press enter to continue to Part 2");
                  input=in.nextLine();
                  System.out.println("");
                  player1 = true;
                  stage = 2;//end case 1
                } else {
                  dice = 0;
                  System.out.println("Player 2 wins");
                  System.out.println("");
                  System.out.print("Press enter to continue to Part 2");
                  input=in.nextLine();
                  System.out.println("");
                  player1 = true;
                  stage = 2;//end case 1
                }
                stage = 2;
              }

    case 2:
              player1TurnScore = 0;
              player1TotalScore = 0;
              player2TurnScore = 0;
              player2TotalScore = 0;
              while(player1TotalScore < WINNINGSCORE && computer1TotalScore < WINNINGSCORE){

                if(player1 == true){
                System.out.print("Player 1 turn total is " + player1TurnScore + ". Enter (r)oll or (s)top:");
                input = in.nextLine();

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("You rolled a " + dice);
                    System.out.println("");
                    player1TurnScore = player1TurnScore + dice;
                  } else {
                    player1 = false;
                    computer1 = true;
                    player1TurnScore = 0;
                    System.out.println("You rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Computer has " + computer1TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  player1TotalScore = player1TotalScore + player1TurnScore;
                  player1TurnScore = 0;
                  player1 = false;
                  computer1= true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Computer has " + computer1TotalScore);
                  System.out.println("");
                }//end score if
              }else if(computer1 == true){

                System.out.println("Computer turn total is " + computer1TurnScore);
                if(computer1TurnScore < 9){
                  input = "r";
                } else {
                  input = "s";
                }

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("Computer rolled a " + dice);
                    System.out.println("");
                    computer1TurnScore = computer1TurnScore + dice;
                  } else {
                    computer1= false;
                    player1 = true;
                    computer1TurnScore = 0;
                    System.out.println("Computer rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Computer has " + computer1TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  computer1TotalScore = computer1TotalScore + computer1TurnScore;
                  computer1TurnScore = 0;
                  computer1 = false;
                  player1 = true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Player 1 has " + player1TotalScore + ", Computer has " + computer1TotalScore);
                  System.out.println("");
                }//end score if

              }//end score if



              }//end main while

              if(player1TotalScore >= WINNINGSCORE || computer1TotalScore>= WINNINGSCORE){


                if(player1TotalScore >= WINNINGSCORE){
                  dice = 0;
                  System.out.println("Player 1 wins");
                  System.out.println("");
                  System.out.println("Press enter to continue to Part 3");
                  input=in.nextLine();
                  System.out.print("");
                  computer1TurnScore = 0;
                  computer1TotalScore = 0;
                  computer2TurnScore = 0;
                  computer2TotalScore = 0;
                  computer1 = true;
                  stage = 3;//end case 1
                } else {

                  dice = 0;
                  System.out.println("Computer wins");
                  System.out.println("");
                  System.out.print("Press enter to continue to Part 3");
                  input=in.nextLine();
                  System.out.print("");
                  computer1TurnScore = 0;
                  computer1TotalScore = 0;
                  computer1 = true;
                  computer2TurnScore = 0;
                  computer2TotalScore = 0;
                  stage = 3;//end case 1
                }
              }

    case 3:
              while(counter <= 10){
              while(computer1TotalScore < WINNINGSCORE && computer2TotalScore < WINNINGSCORE){

                if(computer1 == true){
                System.out.println("Computer 1 turn total is " + player1TurnScore);
                if(computer1TurnScore < 9){
                  input = "r";
                } else {
                  input = "s";
                }

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("Computer 1 rolled a " + dice);
                    System.out.println("");
                    computer1TurnScore = computer1TurnScore + dice;
                    computer1TurnCount++;
                  } else {
                    computer1 = false;
                    computer2 = true;
                    computer1TurnScore = 0;
                    computer1TurnCount++;
                    System.out.println("Computer 1 rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Computer 1 has " + computer1TotalScore + ", Computer 2 has " + computer2TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  computer1TotalScore = computer1TotalScore + computer1TurnScore;
                  computer1TurnScore = 0;
                  computer1 = false;
                  computer2= true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Computer 1 has " + computer1TotalScore + ", Computer 2 has " + computer2TotalScore);
                  System.out.println("");
                }//end score if
              }else if(computer2 == true){

                System.out.println("Computer 2 turn total is " + computer2TurnScore);
                if(computer2TurnScore < 9){
                  input = "r";
                } else {
                  input = "s";
                }

                if (input.equals("R") || input.equals("r")){
                dice = 0;
                dice = rand.nextInt(6) + 1;

                  if(dice > 1){
                    System.out.println("Computer 2 rolled a " + dice);
                    System.out.println("");
                    computer2TurnScore = computer2TurnScore + dice;
                  } else {
                    computer2= false;
                    computer1 = true;
                    computer2TurnScore = 0;
                    System.out.println("Computer 2 rolled a 1");
                    System.out.println("");
                    System.out.println("Turn over.");
                    System.out.println("Current Score: Computer 1 has " + computer1TotalScore + ", Computer 2 has " + computer2TotalScore);
                    System.out.println("");
                  }//end dice if

                }else if(input.equals("S") || input.equals("s")){

                  computer2TotalScore = computer2TotalScore + computer2TurnScore;
                  computer2TurnScore = 0;
                  computer2 = false;
                  computer1 = true;
                  dice = 0;
                  System.out.println("");
                  System.out.println("Turn over.");
                  System.out.println("Current Score: Computer 1 has " + computer1TotalScore + ", Computer 2 has " + computer2TotalScore);
                  System.out.println("");
                }//end score if

              }//end score if



              }//end main while

              if(computer1TotalScore >= WINNINGSCORE || computer2TotalScore>= WINNINGSCORE){


                if(computer1TotalScore >= WINNINGSCORE){
                  dice = 0;
                  System.out.println("Computer 1 wins");
                  System.out.println("");
                  System.out.println("");
                  computer1TurnScore = 0;
                  computer1TotalScore = 0;
                  computer2TurnScore = 0;
                  computer2TotalScore = 0;
                  computer1 = true;
                  counter++;
                  winCount++;

                  stage = 3;//end case 1
                } else {
                  dice = 0;
                  System.out.println("Computer 2 wins");
                  System.out.println("");
                  computer1TurnScore = 0;
                  computer1TotalScore = 0;
                  computer2TurnScore = 0;
                  computer2TotalScore = 0;
                  computer1 = true;
                }//end decider
              }//end winning if

            }//end counter
            double average =  (double)computer1TurnCount/(double)counter;
            System.out.printf("Simulation Over: Computer averaged %.2f",average);
            System.out.print(" turns to get 20 points and won " + winCount + " times");
        break;//end case 3
        default:
                break;
    }//end switch


    in.close();
  }//end psvm
}//end class
