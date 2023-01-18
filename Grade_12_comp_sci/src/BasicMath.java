import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int First_integer;
        int Second_integer;

        System.out.println("Please enter a number from 1 - 9");
        First_integer = scan.nextInt();
        //Making sure that the number isn't too high or too low, would be easier to accomplish in a loop
        /*if (First_integer <= 1 && First_integer >= 9);
        System.out.println("Sorry, but the number is either too high or too low, please try again");*/


        System.out.println("Please enter another number from 1 - 9");
        Second_integer = scan.nextInt();
        /*if (Second_integer <= 1 && Second_integer >= 9);
        System.out.println("Sorry, but the number is either too high or too low, please try again");*/

        int Addition = First_integer + Second_integer;
        int Subtraction = First_integer - Second_integer;
        int Multiply = First_integer * Second_integer;
        int Division = First_integer/Second_integer;
        int Remainder = First_integer % Second_integer;
        int Exponent = (int) Math.pow(First_integer, Second_integer);
        int Exponent_2 = (int) Math.pow(Second_integer, First_integer);

        System.out.println("Adding " + First_integer +" and " + Second_integer + " gives you " + Addition
                +".\nSubtracting them gives us " + Subtraction
                +".\nMultiplying them gives us " + Multiply
                +".\nDividing them gives us " + Division + " with a remainder of " + Remainder
                +".\n" + First_integer +" to the power of " + Second_integer + " gives us " + Exponent
                +" and " + Second_integer +" to the power of " + First_integer + " gives us " + Exponent_2);

    }
}
