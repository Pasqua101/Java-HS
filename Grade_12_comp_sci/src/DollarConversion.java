import java.util.Scanner;

public class DollarConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float cents;
        float quarters;
        float dimes;
        float nickels;
        float pennies;

        System.out.println("please enter an integer less than 100");
        cents = scan.nextFloat();
        //dividing the amount entered by 100 to convert it to cents
        float total = cents/100;

        //Dividing the amount entered by the value of a quarter to find how many quarters are needed
        quarters = (float) Math.floor(total/0.25);
        //Multiplying the amount divided to see if there is any change left
        float total_2 = (float) (0.25 * quarters);
        //Subtracting to find how much change is left
        float total_3 = total - total_2;
        //Dividing the amount entered by the value of a dime to find how many dimes are needed
        dimes = (float) Math.floor(total_3/0.10);
        //Multiplying the amount divided to see if there is any change left
        float total_4 = (float) (0.10 * dimes);
        //Subtracting to find how much change is left
        float total_5 = total_3 - total_4;
        //Dividing the amount entered by the value of a nickel to find how many nickels are needed
        nickels = (float) Math.floor(total_5/0.05);
        //Multiplying the amount divided to see if there is any change left
        float total_6 = (float) (0.05 * nickels);
        //Subtracting to find how much change is left
        float total_7 = total_5 - total_6;
        //Dividing the amount entered by the value of a pennie to see if any pennies are needed
        pennies = (float) Math.floor(total_7/0.01);

        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");









    }
}
