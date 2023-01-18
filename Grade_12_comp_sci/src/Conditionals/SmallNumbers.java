import java.util.Scanner;

public class SmallNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1;
        int num_2;
        int num_3;

        System.out.println("Please enter your first number:");
        num_1 = scan.nextInt();

        System.out.println("Please enter your second number:");
        num_2 = scan.nextInt();

        System.out.println("Please enter your third number:");
        num_3 = scan.nextInt();
        //Using &&(and) to determine which number is the smallest
        //If num_1 is the smallest
        if (num_1 <= num_2 && num_1 <= num_3){
            System.out.println(num_1 + " is the smallest number");
        }//If num_2 is smaller than the other 2 numbers
        if (num_2 <= num_1 && num_2 <= num_3){
            System.out.println(num_2 + " is the smallest number");
        }
        //If num_3 is the smaller than every other number, it goes straight to the else statement
        else{
            System.out.println(num_3 + " is the smallest number");
        }
    }
}
