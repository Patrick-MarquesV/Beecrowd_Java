package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2547 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberOfClients = input.nextInt();

            int minimumHeight = input.nextInt();

            int maximumHeight = input.nextInt();

            int guestsAllowed = 0;

            for(int i = 0; i< numberOfClients; i++){

                int guestHeight = input.nextInt();

                if(guestHeight>=minimumHeight && guestHeight<=maximumHeight){

                    guestsAllowed++;

                }
            }

            System.out.println(guestsAllowed);

        }
    }    
}
