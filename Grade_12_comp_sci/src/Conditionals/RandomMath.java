import java.util.Scanner;

public class RandomMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables for the answers to questions and user answers
        int Answer_1;
        int Answer_2;
        int Answer_3;
        int User_answer_1;
        int User_answer_2;
        int User_answer_3;

        //Making a count variable to tell the user how many questions they got right or wrong in the end
        int right_count = 0;
        int wrong_count = 0;

        //Code for the first question
        //Making number variable to get the numbers needed for the question
        int num_1;
        num_1 = (int) (Math.random() * 11);
        int num_2;
        num_2 = (int) (Math.random() * 11);

        System.out.println("What is " + num_1 + " + " + num_2 + " ?");
        User_answer_1 = scan.nextInt();
        //Adding the two number variables to get the first answer
        Answer_1 = num_1 + num_2;
        //Checking to see if the user answered correctly
        if (User_answer_1 == Answer_1){
            System.out.println("That is the right answer");
            //If user answered right, it will add 1 to the count variable for right answers
            right_count +=1;
        }//If the user answered wrong, it will go to the else statement
        else{
            //Telling the user what the right answer was if they answered wrong
            System.out.println("Sorry, but the right answer is " + Answer_1);
            //If user answered incorrectly, it will add 1 to the count variable for wrong answers
            wrong_count +=1;
        }

        //Code for the second question
        //reusing number variable for the question, so this way I don't have a lot of variables
        num_1 = (int) (Math.random() * 11);
        num_2 = (int) (Math.random() * 11);

        System.out.println("What is " + num_1 + " * " + num_2 + " ?");
        User_answer_2 = scan.nextInt();
        //Getting the answer for the second question by multiplying the numbers
        Answer_2 = num_1 * num_2;
        if (User_answer_2 ==  Answer_2){
            System.out.println("That is the right answer");
            right_count +=1;
        }
        else{
            System.out.println("Sorry, but the right answer is " + Answer_2);
            wrong_count +=1;
        }

        //Code for the third question
        num_1 = (int) (Math.random() * 11);
        num_2 = (int) (Math.random() * 11);

        System.out.println("What is " + num_1 + " - " + num_2 + " ?");
        User_answer_3 = scan.nextInt();
        //Subtracting the two numbers to get the answer for the third question
        Answer_3 = num_1 - num_2;
        if (User_answer_3 ==  Answer_3){
            System.out.println("That is the right answer");
            right_count +=1;
        }
        else{
            System.out.println("Sorry, but the right answer is " + Answer_3);
            wrong_count +=1;
        }
        //Printing out how many questions were answered right or wrong
        System.out.println("You got "+ right_count + " question(s) right and " + wrong_count + " wrong");
    }
}
