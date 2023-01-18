import java.util.Scanner;

public class RegionTrivia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Region;

        System.out.println("Please enter what province you are from? ");
        //Using .nextLine so if the user was to put something in like British Columbia, it reads the whole input
        Region = scan.nextLine();
        //If user types in Ontario
        //using .equal() since I want region to be a equal to the string Ontario
        if (Region.equals("Ontario")){
            System.out.println("Did you know that the population of Ontario is 14.7 million? ");
        }//If user types in Alberta
        else if (Region.equals("Alberta")){
            System.out.println("Did you know that the capital of Alberta is Edmonton? ");
        }//If user types in B.C. as their province
        else if (Region.equals("British Columbia")){
            System.out.println("Did you know that the flower of B.C. is the pacific dogwood?");
        }
        else if (Region.equals("Quebec")){
            System.out.println("Did you know that the capital of Quebec is Quebec City?");

        }//If user types in a province that isn't mentioned in the code
        else{
            System.out.println("I don't know anything about " + Region);
        }
    }
}
