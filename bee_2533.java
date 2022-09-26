package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2533 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int testCases = input.nextInt();

            int upperIndex=0, bottomIndex=0;

            for(int i=0; i<testCases;i++){

                int grades = input.nextInt();
                int workload = input.nextInt();

                upperIndex+= grades*workload;
                bottomIndex+=workload;

            }

            double academicIndex = upperIndex/(bottomIndex*100.0);

            System.out.printf("%.4f\n", academicIndex);

        }



    }
}
