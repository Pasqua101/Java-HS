import java.util.Scanner;

public class PotdRockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Without nested if statements
        /*int user_choice;
        int computer;
        //Using math.random to determine what the computer will play. Using 1+ and *3 gets the computer to randomize a number between 1 and 3
        computer = (int) (1+(Math.random()*3));

        //Asking the user to enter a number between 1 and 3 to determine what they want to play
        System.out.println("Please 1 for rock, 2 for paper and 3 for scissors");
        user_choice = scan.nextInt();

        //If the user plays rock
        //If the computer and user play rock
        if (user_choice == 1 && computer == 1){
            System.out.println("Tie");
        }//If the computer plays paper
        else if (user_choice == 1 && computer == 2){
            System.out.println("Paper beats rock, you lose");
        }//If the computer plays scissors
        else if (user_choice == 1 && computer == 3){
            System.out.println("Rock beats scissors, you win");
        }
        //If the user plays paper
        //If the computer plays the same as the user
        else if (user_choice == 2 && computer == 2){
            System.out.println("Tie");
        }//If the computer plays paper
        else if (user_choice == 2 && computer == 1){
            System.out.println("Paper beats rock, you win");
        }//If the computer play scissors
        else if (user_choice == 2 && computer == 3){
            System.out.println("Scissors beats paper, you lose");
        }
        //If the user plays scissors
        //If the computer plays the same as the user
        else if (user_choice == 3 && computer == 3){
            System.out.println("Tie");
        }//If the computer plays rock
        else if (user_choice == 3 && computer == 1) {
            System.out.println("Rock beats scissors, you lose");
        }//If the computer plays paper
        else if (user_choice == 3 && computer == 2){
            System.out.println("Scissors beats paper, you win");
        }*/

        //With nested if statements

        int user_choice;
        int computer;

        //Using math.random to determine what the computer will play. Using 1+ and *3 gets the computer to randomize a number between 1 and 3
        computer = (int) (1+(Math.random()*3));

        //Asking the user to enter a number between 1 and 3 to determine what they want to play
        System.out.println("Please 1 for rock, 2 for paper and 3 for scissors");
        user_choice = scan.nextInt();

        //If the user plays rock
        if (user_choice == 1){
            //If the computer plays rock
            if (computer == 1){
                System.out.println("Tie");
            }//If the computer plays paper
            else if (computer == 2){
                System.out.println("Paper beats rock, you lose");
            }//If the computer plays scissors, it will go to the else statement
            else{
                System.out.println("Rock beats scissors, you win");
            }
        }
        //If the user plays paper
        if (user_choice == 2){
            //If the computer plays paper
            if (computer == 2){
                System.out.println("Tie");
            }//If the computer plays rock
            else if (computer == 1){
                System.out.println("Paper beats rock, you win");
            }//If the computer plays scissors, it will go to the else statement
            else{
                System.out.println("Scissors beats paper, you lose");
            }
        }
        //if the user plays scissors
        if (user_choice == 3){
            //If the computer plays scissors
            if (computer == 3){
                System.out.println("Tie");
            }//If the computer plays rock
            else if (computer == 1){
                System.out.println("Rock beats scissors, you lose");
            }//If the computer plays paper, it will go to the else statement
            else{
                System.out.println("Scissors beats paper, you win");
            }
        }

    }
}

