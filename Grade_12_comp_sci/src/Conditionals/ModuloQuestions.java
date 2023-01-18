import java.util.Scanner;

public class ModuloQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1;
        int num_2;

        System.out.println("Please enter a number: ");
        num_1 = scan.nextInt();
        System.out.println("Please enter another number: ");
        num_2 = scan.nextInt();
        //using modulo to find the remainder of the two user inputted numbers
        int mod_num = num_1 % num_2;

        System.out.println("Please enter what you think is the remainder of these two numbers");
        int answer = scan.nextInt();
        //If the user's answer is the same as the remainder of the number, it will congratulate the user for answering it right
        if (answer == mod_num){
            System.out.println("That was the right answer");
        }
        //If the user answers wrong, the code goes to the else statement and reminds them how modulo works
        else{
            System.out.println("Sorry, but that was the wrong answer. The right answer is " + mod_num
                    + ". Remember that modulo finds the remainder of the numbers that were divided");
        }
    }
}
