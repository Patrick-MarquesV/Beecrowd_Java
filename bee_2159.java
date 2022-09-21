package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2159 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int naturalNumber = input.nextInt();

        double minPrimeNumber = naturalNumber/Math.log((double)naturalNumber);
        double maxPrimeNumber = 1.25506*minPrimeNumber;

        System.out.printf("%.1f %.1f\n", minPrimeNumber, maxPrimeNumber);

    }
}
