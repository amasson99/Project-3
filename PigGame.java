import java.util.Scanner;

public class PigGame {
	public static boolean gameover = false, playersturn = true, playgame = true;
	public int computerScore = 0,  humanScore = 0;
	public static Scanner kbd = new Scanner(System.in);
	public PigGame(String name) {
		System.out.println("Welcome " + name + " to the game Pig.");
		System.out.println("Start game?(Y/N)");
		if(kbd.nextLine().equalsIgnoreCase("y")) {
			while(playgame) {
				while(humanScore >= 20 && humanScore > computerScore) {
					System.out.println("The Computer Score is " + computerScore + " and your score is " + humanScore + ".");
					System.out.println("Congratulations " + name + ", You WON!");
					System.out.println("Would you like to play agian?(Y/N)");
					if(kbd.nextLine().equalsIgnoreCase("y")) {
						computerScore = 0;
						humanScore = 0;
						new PigGame(name);
					} else {
						System.exit(0);
					}
				}
				while(computerScore >= 20 && computerScore > humanScore) {
					System.out.println("Current score:" + computerScore + " and your score is " + humanScore + ".");
					System.out.println("Sorry you didn't win...");
					System.out.println("Would you like to play agian?(Y/N)");
					if(kbd.nextLine().equalsIgnoreCase("y")) {
						computerScore = 0;
						humanScore = 0;
						new PigGame(name);
					} else {
						System.exit(0);
					}
				}
				while(playersturn) {
					humanScore += new Logic().roll(playersturn);
				}
				while(playersturn != true) {
					computerScore += new Logic().roll(playersturn);
				}
			}
		} else {
			System.exit(0);
		}
	}

	public static void main(String args[]) {
		System.out.print("Please enter your name: ");
		new PigGame(kbd.nextLine());
	}
}

class Logic {
	boolean keepgoing = true;
	int diceRoll = 0, turnPoints = 0, maxScore = 30;
	Scanner kbd = new Scanner(System.in);
	public int roll(boolean playersturn) {
		if(playersturn) {
			while(keepgoing) {
				diceRoll = (int)(Math.random() * 6) + 1;
				if(diceRoll == 1 ) {
					System.out.println("Sorry you rolled: " + diceRoll);
					System.out.println("It is the computer's turn:");
					turnPoints= 0;
					PigGame.playersturn = false;
					keepgoing = false;
				} else {
					System.out.println("You rolled: " + diceRoll);
					turnPoints+=diceRoll;
					System.out.println("Do you wish to roll(r) or hold(h)?");
					if (kbd.nextLine().equalsIgnoreCase("h")) {
						System.out.println("It is the computer's turn:");
						PigGame.playersturn = false;
						playersturn = false;
						keepgoing = false;
					}
				}
			}
		} else if (playersturn != true) {
			while(keepgoing) {
				diceRoll = (int)(Math.random() * 6) + 1;
				if(diceRoll == 1 ) {
					System.out.println("The computer rolled: " + diceRoll);
					turnPoints = 0;
					PigGame.playersturn = true;
					keepgoing = false;
				} else {
					System.out.println("The computer rolled: " + diceRoll);
					turnPoints+=diceRoll;
					if (turnPoints >= 20) {
						PigGame.playersturn = true;
						keepgoing = false;
					}
				}
			}
		}
		return turnPoints;
	}
}
