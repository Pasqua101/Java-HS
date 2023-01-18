import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        String name;
        int age;
        String address;
        int address_number;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name:");
        name = scan.nextLine();

        System.out.println("How old are you");
        age = scan.nextInt();

        System.out.println("What street do you live on?");
        address_number = scan.nextInt();
        address = scan.nextLine();


        System.out.println("Okay, so your name is " + name + ", you're " + age + "years old, and you live at " + address_number + address);
    }
}
