package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2551 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

       while(input.hasNext()){

            int numberOfTrainings = input.nextInt();

            float average = 0, maxAverage=0;

            for(int i = 0; i<numberOfTrainings; i++){
                
                int duration = input.nextInt();
                int distance = input.nextInt();

                average = (float) distance/duration;

                if(average>maxAverage){
                    System.out.println(i+1);
                    maxAverage = average;
                }
            }
       }
    }    
}
