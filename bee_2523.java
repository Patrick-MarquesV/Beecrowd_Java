package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2523 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            String lettersOrder = input.nextLine();

            int numberOfBulbs = input.nextInt();

            StringBuilder willMessage = new StringBuilder();

            for(int i=0; i<numberOfBulbs; i++){

                willMessage.append(lettersOrder.charAt(input.nextInt()-1));

            }

            System.out.println(willMessage.toString());

            input.nextLine();

        }


    }
}
