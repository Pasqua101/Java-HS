import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Making fahrenhiet and celsius as a float so decimals can be inserted
        float Fahrenheit;
        float Celsius;

        System.out.println("Please enter the temperature in farenheit:");
        Fahrenheit = scan.nextFloat();

        //Equation for converting fahrenhiet to celsius
        Celsius = ((Fahrenheit - 32)*5)/9;
        //Rounding the answer from the equation to two decimals
        System.out.printf("The temperature in celsius is %.2f", Celsius);

    }
}
