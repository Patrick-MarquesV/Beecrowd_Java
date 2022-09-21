package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2172 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int expMultiplier;

        long expAmount;

        expMultiplier = input.nextInt();
        expAmount = input.nextLong();

        while(expAmount!=0 && expMultiplier !=0){

            System.out.println(expAmount*expMultiplier);

            expMultiplier = input.nextInt();
            expAmount = input.nextLong();

        }

    }    
}
