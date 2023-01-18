public class ConsecutiveSeriesMarcoPasqua {
    public static void main(String[] args) {
        for (int num = 1; num < 10000; num++){
            int sum=0;
            //Creating a string variable so the numbers consecutively add up to 10000 will eb shown
            String consect_num = " ";
            for (int x = num; x < 10000; x++){
                sum +=x;
                consect_num +=x;
                if (sum == 10000) {
                    System.out.println(consect_num);
                    break;
                }//Making sure that the numbers don't go over 10000
                else if (sum > 10000){
                    System.out.println(consect_num);
                    break;
                }
                consect_num += "+";
            }

        }
        System.out.print(" is equal to 10000");
    }
}
