package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2635 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int serchedWords = input.nextInt();
        input.nextLine();
        
        String[] serchedWordsList = new String[serchedWords];

        for(int i = 0; i<serchedWords; i++){
            serchedWordsList[i] = input.nextLine();
        }

        int newSearchQuery = input.nextInt();
        input.nextLine();

        for(int i = 0; i<newSearchQuery; i++){
            
            int wordsCounter = 0;

            int largerWordSearched = 0;

            String query = input.nextLine();

            for(int j = 0; j<serchedWordsList.length; j++){

                if(serchedWordsList[j].intern().startsWith(query.intern())){
                    wordsCounter++;

                    if(serchedWordsList[j].length()>largerWordSearched){
                        largerWordSearched = serchedWordsList[j].length();
                    }
                }
            }

            if(wordsCounter>0)
                System.out.println(wordsCounter + " " + largerWordSearched);
            else 
                System.out.println(-1);
        }
    }    
}
