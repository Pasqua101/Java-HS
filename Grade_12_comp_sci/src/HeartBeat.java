import java.util.Scanner;

public class HeartBeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Making variables for the amount of heartbeats, made a float because of decimals
        float Heartbeats_min;
        float Heartbeats_hr;
        float Heartbeats_day;
        float Heartbeats_yr;

        System.out.println("Please enter your bpm, beats per minute");
        Heartbeats_min = scan.nextFloat();

        //Equation for finding the number of beats per hour
        Heartbeats_hr = Heartbeats_min * 60;
        System.out.println("Your heart beats "+ Heartbeats_hr + " times per hour.");

        //Equation for finding number of beats per day
        Heartbeats_day = Heartbeats_min * 1440;
        System.out.println("Your heart beats " + Heartbeats_day + " times per day.");

        //Equation for finding number of beats per year by using bpm per day
        Heartbeats_yr = Heartbeats_day * 525600;
        System.out.println("Your hearts beats " + Heartbeats_yr + " times per year.");

    }
}
