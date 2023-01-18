import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Num_1;
        int Num_2;

        System.out.println("Please enter a number:");
        Num_1 = scan.nextInt();

        System.out.println("Please enter another number");
        Num_2 = scan.nextInt();

        if (Num_1 > Num_2){
            System.out.println(Num_1 + " is larger than " + Num_2);
        }

        if (Num_1 < Num_2){
            System.out.println(Num_2 + " is larger than " + Num_1);
        }

        if (Num_1 == Num_2){
            System.out.println("Both number are equal to each other");
        }

    }
}
