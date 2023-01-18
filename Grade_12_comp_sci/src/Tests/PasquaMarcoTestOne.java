package Tests;

import java.util.Scanner;

public class PasquaMarcoTestOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user_age;
        String student;
        String movie_dinner;

        System.out.println("Hello, how old are you?");
        user_age = scan.nextInt();
        System.out.println("Are you a student?");
        student = scan.next();
        System.out.println("Would you like a just a dinner, a movie, or both?");
        movie_dinner = scan.next();
        //For loop not working but was planning on using count to make it run once more
        for (int count = 0; count <= 0; count++){
            //If the user enters an age less than 2
            if (user_age <= 2) {
                System.out.println("Your tickets are free!");
            }
            //If the user is between the ages of 3 and 7
            else if (user_age >= 3 & user_age <= 7) {
                //If the user types both for dinner and movie
                if (movie_dinner.equals("Both")) {
                    System.out.println("That will be $14");
                }//If the user enters Dinner
                else if (movie_dinner.equals("Dinner")) {
                    System.out.println("That will be $12");
                } //If user enter Movie
                else if (movie_dinner.equals("Movie")) {
                    System.out.println("That will be $8");
                }
            }//If the user is more than the age of 8 it will take into account if they're a student or not
            else if (user_age >= 8) {
                //If user types in Yes to the student question, it will display the students discounts(I realized I flaw in my code as seniors may not be students)
                if (student.equals("Yes")) {
                    if (movie_dinner.equals("Both")) {
                        System.out.println("That will be $35");
                    } else if (movie_dinner.equals("Dinner")) {
                        System.out.println("That will be $35");
                    } else if ((movie_dinner.equals("Movie"))) {
                        System.out.println("That will be $12");
                    }
                //If the user types in No, it will display Normal pricing for adults as it is expected(For whatever if No was typed for student It wouldn't go to that part of the code when the response was no, even if it was else if)
                if (student.equals("No")) {
                    if (movie_dinner.equals("Both")) {
                        System.out.println("That will be $50");
                    } else if (movie_dinner.equals("Dinner")) {
                        System.out.println("That will be $40");
                    } else if (movie_dinner.equals("Movie")) {
                        System.out.println("That will be $15");
                        }
        }

                }
                }
            }
        }
    }
