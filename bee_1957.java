package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1957 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        String result = Integer.toHexString(number);

        System.out.println(result.toUpperCase());
    }
}
