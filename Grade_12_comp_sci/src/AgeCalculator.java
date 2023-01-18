import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Name;
        int Year;
        int Age;

        System.out.println("Hello, please enter your name: ");
        Name = scan.nextLine();

        System.out.println("Hi " + Name + ", would you mind telling me what year it is?");
        Year = scan.nextInt();

        System.out.println("I see, so it's the year " + Year + ", could you tell me how old you are turning this year?");
        Age = scan.nextInt();

        //Code for telling the user when they will be 25
        int Year_25 = (Year - Age) + 25;

        //Code for telling the suer when they will be 50
        int Year_50 = (Year - Age) + 50;

        //Code for telling the user when the will be 75
        int Year_75 = (Year - Age) + 75;

        System.out.println(Name + "I can see that right now you are " + Age + "years old. In the year " + Year_25 +", you will be 25 years old."
                + " \nIn the year " + Year_50 + ", You will be 50 years old."
                + " \nIn the year " + Year_75 + " you will be 75 years old.");

    }
}
