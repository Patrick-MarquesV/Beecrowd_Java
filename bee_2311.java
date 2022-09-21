package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class bee_2311 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int competitorsNumber = input.nextInt();

        for(int i=0;i<competitorsNumber; i++){
            
            float score =0;
            
            input.nextLine();
            String competitorName = input.nextLine();

            float dificultLevel = input.nextFloat();

            float[] initialScore = new float[7];

            for(int k = 0; k<initialScore.length; k++){
                initialScore[k] = input.nextFloat();
            }

            Arrays.sort(initialScore);

            float[] finalScore = Arrays.copyOfRange(initialScore, 1, 6);

            for(int j = 0; j<5; j++){
                score+=finalScore[j];
            }

            System.out.printf("%s %.2f\n", competitorName, (score*dificultLevel));
        }
    }
}
