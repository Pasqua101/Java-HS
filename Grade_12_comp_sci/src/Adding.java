import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = scan.nextInt();

        System.out.println("Please enter a second number:");
        int y = scan.nextInt();

        System.out.println(x + y);
    }
}
