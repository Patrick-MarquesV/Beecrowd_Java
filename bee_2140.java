package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2140 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int buyPrice, pricePaid;

        int[] availabeBills = {2, 5, 10, 20, 50, 100};

        while(true){
            buyPrice = input.nextInt();
            pricePaid = input.nextInt();
            int change = pricePaid-buyPrice;

            boolean isPossible = false;

            if(buyPrice==0 && pricePaid==0)
                break;

            for(int bill1 : availabeBills){
                for(int bill2 : availabeBills){
                    if(bill1!=bill2 && bill1+bill2==change){
                        isPossible = true;
                    }
                }
            }

            if(isPossible){
                System.out.println("possible");
            } else{
                System.out.println("impossible");
            }

        }
    }
}