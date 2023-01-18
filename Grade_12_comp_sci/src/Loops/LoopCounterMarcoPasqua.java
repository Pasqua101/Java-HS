import java.util.Scanner;

public class LoopCounterMarcoPasqua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int user_num;
        int num_count = 0;
        int total = 0;
        int average;

        while (true){
            System.out.println("Please enter a number between 1 and 20,"
                    + " please enter 0 to stop the program and to find the average");
            user_num = scan.nextInt();

            //If the number the user entered is more than 20
            if (user_num > 20){
                //If the count variable is less than or equal to 3, it will tell the user to try again and add to the count variable
                if (count <= 3){
                    System.out.println("Please try again");
                    count +=1;
                    System.out.println(count);
                }//If the user does not enter numbers between 1 and 20 4 or more time
                if  (count >= 4){
                    System.out.println("Please stop being annoying");
                    count +=1;
                    System.out.println(count);
                }//If the user doesn't enter a number between 1 and 20 6 times it will terminate the program
                if (count == 6){
                    System.out.println("terminating your program");
                    break;
                }
            }//If user does enter a number between 0 and 20, using 0 because 0 is used to stop the program
            else if (user_num >= 0 & user_num <= 20){
            //Checking to see if the user entered a number between 1 and 20, too make sure it isn't 0
                if (user_num >= 1 & user_num <= 20){
                    //adding the user inputted number to the total
                    total += user_num;
                    num_count +=1;
                    System.out.println("Your numbers added together are " + total + " at the moment");
                }//If the user enters 0, it'll stop the program and calculate the average
                if(user_num == 0){
                    average = total/num_count;
                    System.out.println("Your average is " + average);
                    break;
                }
            }

        }
    }
}
