package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2234 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int totalHotDogs = input.nextInt(), totalParticipants = input.nextInt();

        double average = (double) totalHotDogs/totalParticipants;

        System.out.printf("%.2f\n", average);

    }
}
