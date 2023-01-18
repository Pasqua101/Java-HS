import java.util.Scanner;

public class MinsToYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Making numbers an int so it prints out round number as an answer
        int Minutes;
        int Years;
        int Days;
        int Remaining_minutes;

        //Asking user for number of minutes
        System.out.println("Please enter in the number of minutes:");
        Minutes = scan.nextInt();

        //Formula for years to minutes
        Years = Minutes/525600;

        //Finding the remaining minutes by minutes in a year. Then, dividing that by number of minutes in a day
        Remaining_minutes = Minutes % 525600;
        Days = Remaining_minutes/1440;

        System.out.println(Minutes +" minutes is around " + Years + " year, " + Days +" days and " + Remaining_minutes + " minutes");


    }
}
