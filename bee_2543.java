package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2543 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberGameplays = input.nextInt();
            int studentId = input.nextInt();

            int numberOfVideos = 0;

            for(int i = 0; i<numberGameplays; i++){

                int id = input.nextInt();
                int typeOfgame = input.nextInt();

                if(id == studentId && typeOfgame==0){
                    numberOfVideos++;
                }
            }

            System.out.println(numberOfVideos);
            
        }
    }
}
