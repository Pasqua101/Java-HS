import java.util.*;
public class NumberApplicationMarcoPasqua {
    public static void main(String[] args) {
        //creating a list to store the prime numbers
        ArrayList<Integer>PrimeNums = new ArrayList<>();

        long nums = 1000000;
        //Timing how long it takes for the program to run
        long start = System.currentTimeMillis();
        long count = 1;
        long count2 = 1;
        PrimeNums.add(2);
        System.out.println("2");
        for (int x = 3; x <= nums; x +=2){
            boolean if_prime = true;
            for (int y = 2; y <= Math.sqrt(y); y++){
                //Finding the prime numbers by checking all odd numbers and figuring out if they have factors
                if(x % y==0)if_prime = false;
            }
            if (if_prime){
                System.out.println(x);
                //Adding the prime numbers to the array and print it out
                PrimeNums.add(x);
                count ++;
            }
        }
        System.out.println("number of prime numbers are: " + count);

        //Exercise 2
        for (int x = 3; x<=(nums/2); x +=2){
            if (PrimeNums.contains(x)){
                int prime_pair = (x*2)+1;
                if (PrimeNums.contains(prime_pair)) {
                    count2 ++;
                    System.out.println(x + ". " + prime_pair + " prime pair");
                    //Checking if a prime number and its prime pair are in the list by
                    // incrementing odd numbers then making their prime pair and checking if the pair is also in the list
                }
            }
        }
        System.out.println(count2);

        //Exercise 3 and 4
        String per_num = "1";
        String ab_num = "";
        String def_num = "";
        int sum;

        for (int num = 2; num <=1000; num ++){
            sum = 0;
            for (int x = 1; x <=num/2; x++){
                if (num%x == 0){
                    sum += x;
                }
            }
            if (sum == num){
                per_num += " " + num;
            }
            else if (sum > num){
                ab_num += " " + num;
            }
            else{
                def_num += " " + num;
                //Calculating all numbers going to 1000 and checking the group they belong to
                //per_num = perfect number, ab_num = abundant number, def_num = deficient number

            }
        System.out.println("Perfect numbers are " + per_num);
        System.out.println("Abundant numbers are " + ab_num);
        System.out.println("Deficient numbers are " + def_num);
        }
        //Exercise 5
        for (int x=100; x<1000; x++){
            int sm = 0;
            int brk = x;
            while(brk > 0){
                sm += (brk % 10)*(brk % 10)*(brk % 10);
                brk = brk/10;

            }
            if(sm==x){
                System.out.println("The sum of the cubes of " + x + "s digits is equal to " + x);
            } //Finding the remainder of the 3 digits and then multiplying them 3 times, then dividing by 10 to find the next remainder until 0
        }
        //Exercise 6
        for (int x = 1000; x <= 9999; x++){
            int group_one = x/100;
            int group_two = x%100;
            int num = ((group_one + group_two)*(group_one + group_two));
            //Taking the first 2 and last 2 numbers in a 4 digit number in order to make them equal to 2 different variables then adding and squaring them to find out if they are equivalent to the original number
            if (num == x){
                System.out.println("The sum of " + x +
                        "s first two and last two numbers squared are equal to " + x);

            }
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " Milliseconds");
    }
}
