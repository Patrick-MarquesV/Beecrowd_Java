package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2709 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){    
            int numberOfCoins = input.nextInt();

            int[] pileOfCoins = new int[numberOfCoins];

            for (int i = 0; i < pileOfCoins.length; i++) {
                pileOfCoins[i] = input.nextInt();
            }

            int jump = input.nextInt();

            int sum = 0;

            for (int i = pileOfCoins.length-1; i >= 0 ; i-=jump) {
                sum+=pileOfCoins[i];
            }

            boolean isPrime = sum <= 1 ? false : true;

            for (int i = 2; i <= sum/2; i++) {
                if(sum%i==0){
                    isPrime=false;
                }
            }

            if(isPrime){
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            } else{
                System.out.println("Bad boy! I’ll hit you.");
            }

        }
    }    
}
