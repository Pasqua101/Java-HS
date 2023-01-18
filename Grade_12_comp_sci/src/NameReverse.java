import java.util.Scanner;

public class NameReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Putting first and last name as a string
        String First_name;
        String Last_name;

        System.out.println("What is your first name?");
        First_name = scan.next();

        System.out.println("What is your last name?");
        Last_name = scan.next();
        //Printing last name and then followed by a comma with first name after
        System.out.println("Hello " + Last_name + ", " + First_name);


    }
}
