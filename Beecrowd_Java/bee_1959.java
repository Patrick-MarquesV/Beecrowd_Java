package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1959 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        long numA=input.nextInt();
        int numB=input.nextInt();

        System.out.printf("%d\n", numA*numB);
    }
}
