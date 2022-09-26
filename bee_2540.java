package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2540 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberVotes = input.nextInt();

            int result = 0;

            for(int i = 0; i<numberVotes; i++){
                result+=input.nextInt();
            }

            if(result>=numberVotes*2/3.0){
                System.out.println("impeachment");

            } else{
                System.out.println("acusacao arquivada");
            }

        }

    }
}
