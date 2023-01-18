import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a;
        float b;
        float c;

        System.out.println("Please enter your number for the a variable:" );
        a = scan.nextFloat();

        System.out.println("Please enter your number for the b variable: ");
        b = scan.nextFloat();

        System.out.println("Please enter your number for the c variable: ");
        c = scan.nextFloat();

        //Finding the discriminate by doing b^2 - 4ac
        float discriminant  = (float) (b * b - 4.0 * a * c);

        //If the discriminant is bigger than 0, there are 2 roots
        if (discriminant > 0.0){
            //Using quadratic equation to find the roots
            float root_1 = (float) (-b + Math.sqrt(discriminant) / (2 * a));
            float root_2 = (float) (-b - Math.sqrt(discriminant) / (2 * a));

            //Rounding the answers for the roots
            System.out.printf("There are tow roots, root one is %.2f ", root_1);
            System.out.printf(" and root two is %.2f ", root_2);
        }//If the discriminate is equal to 0, there is one root
        else if (discriminant == 0.0){
            float root_1 = (float) (-b / (2.0 * a));
            System.out.printf("The root is %.2f ", root_1);
        }//If the discriminate is neither more than or equal to 0, there are no roots
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
