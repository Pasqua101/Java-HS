import java.util.Scanner;

public class PotdSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Making the user input variable for the keypad an int
        String num_keys;

        System.out.println("Please enter a number on your keypad, from 0-9");
        num_keys = scan.next();

        //Switch statement will use num_keys variable
        switch(num_keys) {
            case "0":
                System.out.println("You pressed 0");
                //Will break the switch statement if user enter a number mentioned
                break;
            case "1":
                System.out.println("You pressed 1");
                break;
            case "2":
                System.out.println("You pressed 2");
                break;
            case "3":
                System.out.println("You pressed 3");
                break;
            case "4":
                System.out.println("You pressed 4");
                break;
            case "5":
                System.out.println("You pressed 5");
                break;
            case "6":
                System.out.println("You pressed 6");
                break;
            case "7":
                System.out.println("You pressed 7");
                break;
            case "8":
                System.out.println("You pressed 8");
                break;
            case "9":
                System.out.println("You pressed 9");
                break;
            //If user enters a number not used in switch statement it will go to default statement
            default:
                System.out.println("Not allowed");
        }

    }
}
