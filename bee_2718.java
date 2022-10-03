package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2718 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        StringBuilder str = new StringBuilder();

        int testCases = input.nextInt();

        for (int i = 0; i < testCases; i++) {
            
            long numberOfBulbs = input.nextLong();

            String[] binaryListOfBulbs = Long.toBinaryString(numberOfBulbs).split("");

            int burnedBulbs = 0, replacedBulbs=0;

            for (int j = 0; j < binaryListOfBulbs.length; j++) {
                if(binaryListOfBulbs[j].equals("1")) burnedBulbs++;
                else burnedBulbs=0;

                if(burnedBulbs>replacedBulbs) replacedBulbs=burnedBulbs; 
            }
            
            str.append(replacedBulbs+"\n");
        }
        System.out.print(str.toString());
    }    
}
