import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1;
        int num_2;
        int num_3;

        System.out.println("Please enter your first number: ");
        num_1 = scan.nextInt();
        System.out.println("Please enter your second number: ");
        num_2 = scan.nextInt();
        System.out.println("Please enter your third number: ");
        num_3 = scan.nextInt();
        //If num_1 is the largest number
        if (num_1 >= num_2 && num_1 >= num_3){
            System.out.println(num_1 + " is the largest number");
        }
        //If num_2 is the largest number
        if (num_2 >= num_1 && num_2 >= num_3){
            System.out.println(num_2 + " is the largest number");
        }
        //If num_3 is the largest number
        if (num_3 >= num_2 && num_3 >= num_1){
            System.out.println(num_3 + " is the largest number");
        }
        //If the user enters the same numbers for all 3 numbers
        if (num_1 == num_2 && num_1 == num_3) {
            System.out.println("Those numbers are all equal to each other");
        }
    }
}
