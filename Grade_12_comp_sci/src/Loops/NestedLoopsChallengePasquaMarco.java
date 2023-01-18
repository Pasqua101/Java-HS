public class NestedLoopsChallengePasquaMarco {
    public static void main(String[] args) {

        //Main program
        //Array used to store numbers, using a 2d array to use a nested for loop
        String[][] NumsOutput = { {"1", "22", "333"},
                {"4444", "55555", "666666"}};
        //printing out the first row with i variable
        for (int i = 0; i < 2; i++){
            //Printing out second row with j variable
            for (int j = 0; j < 3; j++){
                System.out.println(NumsOutput[i][j]);
            }
        }
        //Extension for printing in reverse, doesn't work
        for (int k = NumsOutput.length-1; k >= 2; k--){
            for (int l = NumsOutput.length-1; l >= 3; l--){
                System.out.println(NumsOutput[k][l]);
            }
        }
    }
}
