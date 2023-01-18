import java.util.Scanner;

public class LetterWeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight;
        int extra_weight;
        int extra_price;
        System.out.println("How much does your letter weigh?");
        weight = scan.nextInt();

        //If weight is less than or equal to 30 grams
        if(weight <= 30){
            System.out.println("To mail your letter, it will cost 30 sinas");
        }//If weight is more than 30 grams and less than or equal to 50 grams
        else if(weight > 30 && weight <= 50){
            System.out.println("To mail your letter, it will cost 55 sinas");
        }//If weight is more than 50 grams and less than or equal to 100 grams
        else if (weight > 50 && weight <= 100){
            System.out.println("To mail your letter, it will cost 70 sinas");
        }//If weight entered is over 100 grams
        else{
            //finding the additional weight in the letter by subtracting the weight by 100
            extra_weight = weight - 100;
            //Finding how many extra sinas the user would pay
            extra_price = (extra_weight/50) * 25;
            //Adding the additional amount to the amount a person would pay if the letter weighed 100 grams
            extra_price = extra_price + 70;
            System.out.println("To mail your letter, it will cost "+ extra_price + " sinas");

        }

    }
}
