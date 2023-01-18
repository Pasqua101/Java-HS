import java.util.Scanner;

public class IntegerAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Number;
        int Sum;

        System.out.println("Please enter a number from 0 - 1000");
        Number = scan.nextInt();

        //Finding the remainder to find the digits in the number, then assigning the remaining numbers in the integer to Remaining_num
        int First_digit = Number % 10;
        int Remaining_num = Number / 10;
        int Second_digit = Remaining_num % 10;
        Remaining_num = Remaining_num / 10;
        int Third_digit = Remaining_num % 10;
        Remaining_num = Remaining_num / 10;
        int Fourth_digit = Remaining_num % 10;
        //Adding all of the digits together
        Sum = Third_digit + Second_digit + First_digit + Fourth_digit;

        System.out.println("The sum of all the digits in the number " + Number + " is " + Sum);

    }
}
