import java.util.Scanner;

public class AgeSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("Please enter your age: ");
        age = scan.nextInt();
        //If the user is less than 13
        if (age < 13){
            System.out.println("You are a child");
        }//If the user is in between the ages of 13 and 19
        else if (age >= 13 && age <= 19){
            System.out.println("You are a teen");
        }//If the user is in between the ages of 20 and 56
        else if (age >= 20 && age <= 65){
            System.out.println("You are an adult");
        }//If the user is over the age of 65
        else if(age > 65){
            System.out.println("You are a senior citizen");
        }
    }
}
