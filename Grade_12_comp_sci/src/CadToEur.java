import java.util.Scanner;

public class CadToEur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Canadian;
        double Euro;

        System.out.println("Enter your dollar amount in CAD:");
        Canadian = scan.nextFloat();

        //Exchange rate for CAD to EUR is 0.65
        Euro = Canadian*0.65;

        System.out.println("$" + Canadian + " CAD is worth €" + Euro + " EUR");
    }
}
