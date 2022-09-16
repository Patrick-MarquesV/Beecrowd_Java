package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class bee_2164 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int naturalNumber = input.nextInt();

        double fibonnacciValue = (Math.pow((((1+Math.sqrt(5.0))/2.0)), (double) naturalNumber) - Math.pow((((1-Math.sqrt(5.0))/2.0)), (double) naturalNumber))/Math.sqrt(5.0);
        
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(df.format(fibonnacciValue));

    }
}
        