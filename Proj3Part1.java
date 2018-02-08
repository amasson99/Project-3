import java.util.*;

public class Proj3Part1
{
 public static void main(String[] args)
 {
     int turnScore = 0;
     int totalScore = 0;
     int turnScore2 = 0;
     int totalScore2 = 0;
     final int WIN = 20;
     int dice = 0;
     int dice2 = 0;
     String input = "r";
     String input2 = "r";
     char repeat;

     Scanner keyboard = new Scanner(System.in);
     Scanner s = new Scanner (System.in);

     Random randomNumbers = new Random();

     while(totalScore < WIN && totalScore2 < WIN)
     {
       //Player 1's turn

      do
      {
          dice = randomNumbers.nextInt(6) + 1;
          System.out.println();
          System.out.println("You rolled: " + dice);

               if(dice == 1)
               {
                   turnScore = 0;
                   System.out.println("Turn over.");
                   System.out.println("Player 1 total is " + totalScore);
                   break;
               }
               else
               {
                  turnScore = dice; //removed +=??? think it's only the value of dice roll?
                                    //either way it's used to compute total, which would be redundant if not
                  totalScore +=turnScore; //added to compute totalScore before turn is over
                  System.out.print("Player 1 turn total is " + totalScore + " ");
                  System.out.print("Enter (r)oll or (s)top: ");
                  input = keyboard.nextLine();
                  repeat = input.charAt(0);


                     if(repeat == 's')
                     {
                         System.out.println("Turn over.");
                         System.out.print("Current score: Player 1 has " + totalScore); //previously total wasn't computed
                         System.out.println(", Player 2 has " + totalScore2);
                         break;

                     }
               }
      }while(input.equalsIgnoreCase("r"));


        //totalScore += turnScore; was removed + curly braces that seemed to attach it to the above while loop
        //it isn't needed due to totalScore now being calculated after dice is rolled when !=1(else portion)

      if(totalScore >= WIN)
      {
          System.out.println("Your total Score is " + totalScore);
          System.out.println("Player 1 wins!");
          break; //added to break the loop if player 1 wins
      }


      //player2's turn
      System.out.println();
      System.out.println("It is Player 2's turn.");

      do
      {
          dice2 = randomNumbers.nextInt(6) + 1;
          System.out.println("Player 2 rolled: " + dice2);

          if(dice2 == 1)
            {
              turnScore2 = 0;
              System.out.print("Turn over");
              System.out.println("Player 2 total is " + totalScore2);
              break;
            }
          else
            {
              turnScore2 = dice2; //removed += ... same as for player 1's turn
              totalScore2 += turnScore2; //added totalScore2 calculations.
              System.out.print("Player 2 total is " +totalScore2 + " ");
              System.out.print("Enter (r)oll or (s)top: ");
              input = keyboard.nextLine();
              repeat = input.charAt(0);


              if(repeat == 's')
               {
                System.out.println("Turn over");
                System.out.print("Current score: Player 1 has " + totalScore);
                System.out.println(", Player 2 has " + totalScore2);
                break;
              }
            }
    }
    while(input2.equalsIgnoreCase("r")); //{ <- incorrect brace + fixed loop for dice2 !=1, then removed it :P since you already did a check inside the do-while loop

        //totalScore2 += turnScore2; removed, no longer is needed

          //}
     //} <- not needed nor is the brace that was infront of the do while loop.
    if(totalScore2 >= WIN) //removed semicolon since it ended the if statement before it's body
      {
          System.out.println("Player 2 score is " + totalScore2 + "\n");
          System.out.println("Player 2 wins");
          break;
      }

    if(totalScore>totalScore2) //added loops to check which score is higher and terminate
    {
      System.out.println("Player 1 Wins!");
      break;
    }else if(totalScore==totalScore2){
      System.out.println("It's a Tie!");
      break;
    }else if(totalScore<totalScore2){
      System.out.println("Player 2 Wins!");
      break;
    }
  }
s.close();
keyboard.close();
 }
}
