public class PotdLoops {
    public static void main(String[] args) {
        int count = 0;
        //while loop being used
        while (count < 5){
            count+=1;
            System.out.println(count);
        }
        System.out.println("------------------------------");
        //do loop being used
        count = 0;
        do{
            count ++;
            System.out.println(count);
        }while (count < 5);
        System.out.println("-----------------------------");
        //for loop being used
        for (count = 1; count <= 5; count ++){
            System.out.println(count);
        }
    }
}
