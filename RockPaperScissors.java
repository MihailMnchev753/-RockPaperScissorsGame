import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerChoose = scan.nextLine();

        if (playerChoose.equals("r") || playerChoose.equals("rock")){
            playerChoose = rock;
        } else if (playerChoose.equals("p") || playerChoose.equals("paper")) {
            playerChoose = paper;
        } else if (playerChoose.equals("s") || playerChoose.equals("scissors")) {
            playerChoose = scissors;
        }else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random random = new Random();
        int computerRandomNum = random.nextInt(3);
        String computerMove = "";

        if ( computerRandomNum == 0){
            computerMove = rock;
        } else if (computerRandomNum == 1) {
            computerMove = paper;
        } else  {
            computerMove = scissors;
        }
        System.out.printf("The computer chose %s.%n",computerMove);

        if (playerChoose.equals(rock) && computerMove.equals(scissors)||playerChoose.equals(paper) && computerMove.equals(rock)||playerChoose.equals(scissors) && computerMove.equals(paper)){
            System.out.println("You win.");
        } else if (playerChoose.equals(rock) && computerMove.equals(rock) || playerChoose.equals(paper) && computerMove.equals(paper) || playerChoose.equals(scissors) && computerMove.equals(scissors)){
            System.out.println("This game was a draw.");
        }else {
            System.out.println("You lose.");
        }
    }
}
