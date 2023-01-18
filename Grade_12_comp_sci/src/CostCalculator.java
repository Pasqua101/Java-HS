import java.util.Scanner;

public class CostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Spent;
        double Tax_added;
        double Tip_15;
        double Tip_10;
        double Tip_18;


        System.out.println("Hello, how much did you pay?");
        Spent = scan.nextFloat();

        //Price of item with tax included
        Tax_added = Spent * 1.13;
        //Tax_added = Math.round(Tax_added);

       //15% tip
        Tip_15 = Tax_added * 1.15;
        //Tip_15 = Math.round(Tip_15);

        //10% tip
        Tip_10 = Tax_added * 1.10;
        //Tip_10 = Math.round(Tip_10);

        //18% tip
        Tip_18 = Tax_added * 1.18;
        //Tip_18 = Math.round(Tip_18);


        //Just printing out 15% tax for first part
        System.out.printf("Including tax you are paying $%.2f %n",(float) (Tax_added));
        System.out.printf("However, with a 15 percent tip that will cost $%.2f %n",(float) (Tip_15));

        //First extension with all types of tax (%% prints percent sign)
        System.out.printf("For a 10%% tip, you will be paying $%.2f %n",(float) (Tip_10));
        System.out.printf("For a 15%% tip, you will be paying $%.2f %n",(float) (Tip_15));
        System.out.printf("For a 18%% tip, you will be paying $%.2f %n",(float) (Tip_18));

        //Second extension that prints out how many quarters are needed
        double Quarters = Tip_15 / 0.25;

        System.out.println("To pay the total cost with a 15% tip with quarters, you would need " + (int) Math.ceil((float) (Quarters )));

    }
}
