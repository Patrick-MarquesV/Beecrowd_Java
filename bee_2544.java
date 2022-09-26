package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2544 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberNinjas = input.nextInt();

            int numberOfClones = (int) (Math.log((double) numberNinjas)/Math.log(2));

            System.out.println(numberOfClones);
            
        }
    }    
}