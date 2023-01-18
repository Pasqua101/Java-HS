import java.util.Scanner;

public class DimensionsRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Making variables a float for decimals
        float Width;
        float Length;
        float Area;
        float Perimeter;

        System.out.println("Please enter the width of the rectangle: ");
        Width = scan.nextFloat();

        System.out.println("Please enter the length of the rectangle: ");
        Length = scan.nextFloat();

        //Formula for area of a rectangle
        Area = Width * Length;
        //Formula for perimeter of a rectangle
        Perimeter = 2*(Width + Length);

        //Using printf so the answers can be rounded
        System.out.printf("The area of the rectangle is %.2f", Area);
        System.out.printf(" and the perimeter of the rectangle is %.2f", Perimeter);

    }
}
