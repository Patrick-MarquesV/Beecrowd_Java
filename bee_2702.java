package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2702 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int[] airPlaneFood = new int[3];

        int missingFood = 0;

        for (int i = 0; i < 3; i++) {
            airPlaneFood[i]=input.nextInt();
        }

        for (int i = 0; i < airPlaneFood.length; i++) {
            int passengersChoice = input.nextInt();

            if(passengersChoice>airPlaneFood[i]) missingFood += (passengersChoice-airPlaneFood[i]);
        }

        System.out.println(missingFood);

    }
}
