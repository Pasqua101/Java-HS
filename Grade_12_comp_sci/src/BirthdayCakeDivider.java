import java.util.Scanner;

public class BirthdayCakeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Guests;
        // Inputting number of slices available
        int Cake_slices = 32;
        int Remaining_slices;
        int Remainder;

        //Getting input on number of guest
        System.out.println("Please enter the number of guest attending: ");
        Guests = scan.nextInt();

        //Seeing how many slices each person can get
        Remaining_slices = Cake_slices/Guests;
        //Left over amount of slices
        Remainder = Cake_slices % Guests;

        System.out.println("Number of guest: " + Guests);

        //Option 1, round the number of slices
        System.out.println(" Option 1: " + Math.floor(Remaining_slices) + " pieces each.");

        System.out.println(Remainder + " left over");
        //Option 2, don't round the number of slices
        System.out.println("Option 2: " + Remaining_slices + "." + Remainder + " pieces each.");


    }
}