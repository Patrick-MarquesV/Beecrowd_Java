package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2542 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberAttributes = input.nextInt();

            int marcosDeckSize = input.nextInt();
            int leosDeckSize = input.nextInt();

            int[][] marcosDeckList = new int[marcosDeckSize][numberAttributes];
            int[][] leosDeckList = new int[leosDeckSize][numberAttributes];


            for(int i=0; i<marcosDeckSize; i++){
                for(int j = 0; j<numberAttributes; j++){
                    marcosDeckList[i][j]=input.nextInt();
                }
            }

            for(int i=0; i<leosDeckSize; i++){
                for(int j = 0; j<numberAttributes; j++){
                    leosDeckList[i][j]=input.nextInt();
                }
            }

            int marcosCardChoise = input.nextInt()-1;
            int leosCardChoise = input.nextInt()-1;

            int attributeChoise = input.nextInt()-1;

            if(marcosDeckList[marcosCardChoise][attributeChoise]>leosDeckList[leosCardChoise][attributeChoise]){
                System.out.println("Marcos");
            } else if(leosDeckList[leosCardChoise][attributeChoise] > marcosDeckList[marcosCardChoise][attributeChoise]){
                System.out.println("Leonardo");
            } else{
                System.out.println("Empate");
            }



        }


    }
}
