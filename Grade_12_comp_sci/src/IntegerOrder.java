import java.util.Scanner;

public class IntegerOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_1;
        int num_2;
        int num_3;

        System.out.println("please enter your first number");
        num_1 = scan.nextInt();
        System.out.println("please enter your second number");
        num_2 = scan.nextInt();
        System.out.println("please enter your third number");
        num_3 = scan.nextInt();

        //If num_1 is smaller than both num_2 and num_3
        if (num_1 < num_2 && num_1 < num_3){
            //If num_2 is smaller than num_3 helps to determine what order to print out the numbers
            if(num_2 < num_3) {
                System.out.println("The numbers from lowest to highest are " + num_1 + " " + num_2 + " " + num_3);
            }//If num_3 is smaller than num_2
            if (num_3 < num_2){
                System.out.println("The numbers from lowest to highest are " + num_1 + " " + num_3 + " " + num_2);
            }
        }//If num_2 is smaller than both num_1 and num_3
        if (num_2 < num_1 && num_2 < num_3){
            //If num_1 is smaller than num_3
            if (num_1 < num_3){
                System.out.println("The numbers from lowest to highest are " + num_2 + " " + num_1 + " " + num_3);
            }//If num_3 is smaller than num_1
            if (num_3 < num_1){
                System.out.println("The numbers from lowest to highest are " + num_2 + " " + num_3 + " " + num_1);
            }
        }//If num_3 is smaller than both num_1 and num_2
        if (num_3 < num_1 && num_3 < num_2){
            //If num_1 is smaller than num_2
            if (num_1 < num_2){
                System.out.println("The numbers from lowest to highest are " + num_3 + " " + num_1 + " " + num_2);
            }//If num_2 is smaller than num_1
            if (num_2 < num_1){
                System.out.println("The numbers from lowest to highest are " + num_3 + " " + num_2 + " " + num_1);
            }
        }
    }
}
