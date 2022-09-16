package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2163 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int terrainRows = input.nextInt(), terrainColumns = input.nextInt();

        int[] position = {0, 0};

        int[][] terrainCoordinates = new int[terrainRows][terrainColumns];

        for(int i = 0; i<terrainRows; i++){
            for(int j = 0; j<terrainColumns; j++){
                terrainCoordinates[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i<terrainRows; i++){
            for(int j = 0; j<terrainColumns; j++){
                if(terrainCoordinates[i][j]==42 && i>0 && i<terrainRows && j>0 && j<terrainColumns){
                    if(terrainCoordinates[i-1][j]==7 && 
                        terrainCoordinates[i+1][j]==7 && 
                        terrainCoordinates[i][j-1]==7 && 
                        terrainCoordinates[i][j+1]==7 && 
                        terrainCoordinates[i-1][j+1]==7 && 
                        terrainCoordinates[i+1][j-1]==7 && 
                        terrainCoordinates[i-1][j-1]==7&& 
                        terrainCoordinates[i+1][j+1]==7){
                            position[0] = i+1;
                            position[1] = j+1;
                    }
                }
            }
        }
        
        System.out.println(position[0] + " " + position[1]);

    }

}
