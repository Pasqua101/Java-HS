import java.util.Scanner;

public class MathProblems {

    public static void main(String[] args) {

        int User_answer_1;
        int User_answer_2;
        int User_answer_3;
        int User_answer_4;
        int User_answer_5;


        Scanner scan = new Scanner(System.in);

        //Asking the user what the answer to the first question is
        System.out.println("What is 4 x 9 ?");
        User_answer_1 = scan.nextInt();
        int Answer_1 = 4 * 9;
        //Determining if the user's answer is equal to the actual answer
        if (User_answer_1 == Answer_1) {
            System.out.println("That was the right answer!");

        }//If the user answer wrong,the code will move to the else if statement
        else if (User_answer_1 != Answer_1) {
            System.out.println("Sorry, but that was the wrong answer. The right answer is " + Answer_1);
        }
        //Asking the user what the answer to the second question is
        System.out.println("What is 9/3 ?");
        User_answer_2 = scan.nextInt();
        int Answer_2 = 9/3;
        //Determining if the user's answer is equal to the actual answer
        if (User_answer_2 == Answer_2){
            System.out.println("That was the right answer!");
        } else if (User_answer_2 != Answer_2){
            System.out.println("Sorry, but the right answer is " + Answer_2);
        }
        //Asking the user what the answer to the third question is
        System.out.println("What is 4 + 3 ?");
        User_answer_3 = scan.nextInt();
        int Answer_3 = 4+3;
        //Determining if the user's answer is equal to the actual answer
        if (User_answer_3 == Answer_3){
            System.out.println("That was the right answer!");
        }//If the user answered the third question wrong
        else if (User_answer_3 != Answer_3){
            System.out.println("Sorry, but that isn't correct. The right answer is " + Answer_3);
        }
        //Asking the user what the answer to the fourth question is
        System.out.println("What is 5 - 3 ?");
        User_answer_4 = scan.nextInt();
        int Answer_4 = 5-3;
        //Determining if the user's answer is equal to the actual answer
        if (User_answer_4 == Answer_4){
            System.out.println("That was the right answer!");
        }//If the user answered the fourth question wrong
        else if (User_answer_4 != Answer_4){
            System.out.println("Sorry, but the right answer is " + Answer_4);
        }

        System.out.println("What is 9 + 10");
        User_answer_5 = scan.nextInt();
        int Answer_5 = 9+10;
        if (User_answer_5 == Answer_5){
            System.out.println("That was the right answer!");
        }else if (User_answer_5 != Answer_5){
            System.out.println("Sorry, but the right answer is " + Answer_5);
        }











    }
}
