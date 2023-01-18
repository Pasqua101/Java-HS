import java.util.Scanner;

public class CourseAverageRounded {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Course_1;
        int Course_2;
        int Course_3;
        int Course_4;
        int count;
        count = 0;
        float Course_Total;
        float Average;

        System.out.println("Please enter the mark of your first course:");
        Course_1 = scan.nextInt();
        count +=1;

        System.out.println("Please enter the mark of your second course:");
        Course_2 = scan.nextInt();
        count +=1;

        System.out.println("Please enter the mark of your third course:");
        Course_3 = scan.nextInt();
        count +=1;

        System.out.println("Please enter the mark of your fourth course:");
        Course_4 = scan.nextInt();
        count +=1;

        Course_Total = Course_1 + Course_2 + Course_3 + Course_4;
        Average = Course_Total/count;

        System.out.printf("Your course average is %.1f", Average);



    }
}
