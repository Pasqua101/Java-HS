import java.util.Scanner;

public class CourseAverage {
    public static void main(String[] args) {

        int Course_1;
        int Course_2;
        int Course_3;
        int Course_4;
        int count;
        count = 0;
        double Course_Total;
        double Average;

        Scanner scan = new Scanner(System.in);

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

        System.out.println("Your course average is " + Average);



    }
}
