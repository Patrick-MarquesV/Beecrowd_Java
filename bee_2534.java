package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class bee_2534 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberOfCitizens = input.nextInt();
            int queries = input.nextInt();

            int[] listOfCitizens = new int[numberOfCitizens];

            for(int i = 0; i<listOfCitizens.length; i++){

                listOfCitizens[i] = input.nextInt();

            }

            Arrays.sort(listOfCitizens);
            
            for(int i = 0; i<queries; i++){

                System.out.println(listOfCitizens[listOfCitizens.length - input.nextInt()]);

            }

        }

    }    
}