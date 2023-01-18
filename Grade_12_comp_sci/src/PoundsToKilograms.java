import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Pounds;
        double Kilograms;

        System.out.println("Enter weight in pounds (lbs): ");
        Pounds = scan.nextDouble();

        //Formula for converting lbs to kg
        Kilograms = Pounds/2.20462262;

        System.out.println("The weight in kg is " + Kilograms);

    }
}
