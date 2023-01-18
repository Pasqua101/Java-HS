import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Making both name variables a string variable since the user types them
        String User_name;
        String My_name = "Marco";

        System.out.println("Please enter your name: ");
        User_name = scan.next();
        //ide was giving me problems with using ==, as it was skipping to the else statement. It recommended me to use .equals()
        if (User_name.equals(My_name)) {
            System.out.println("Hey, that's my name too!");
        } //If the user doesn't enter my name
        else {
            System.out.println("Hello " + User_name);
        }

    }
}
