package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2552 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int lines = input.nextInt();
            int columns = input.nextInt();

            int[][] cheeseBoard = new int[lines][columns];
            int[][] finalBoard = new int[lines][columns];

            StringBuilder str = new StringBuilder();

            for(int i = 0; i< lines; i++){
                for(int j = 0; j<columns;j++){
                    cheeseBoard[i][j] = input.nextInt();
                }
            }
            
            for(int i = 0; i< lines; i++){
                for(int j = 0; j<columns;j++){
                    
                    if(i<lines-1){
                        if(cheeseBoard[i+1][j]==1)
                            finalBoard[i][j]++;
                    }

                    if(i>0){
                        if(cheeseBoard[i-1][j]==1)
                            finalBoard[i][j]++;
                    }

                    if(j<columns-1){
                        if(cheeseBoard[i][j+1]==1)
                            finalBoard[i][j]++;
                    }

                    if(j>0){
                        if(cheeseBoard[i][j-1]==1)
                            finalBoard[i][j]++;                  
                    }
                    
                    if(cheeseBoard[i][j]==1){
                        finalBoard[i][j]=9;
                    }

                    str.append(finalBoard[i][j]);

                }
                str.append("\n");
            }

            System.out.print(str.toString());
        }
    }    
}