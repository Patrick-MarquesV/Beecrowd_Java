package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2168 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int mapSize = input.nextInt()+1;
        int[][] cameraStatusMap = new int [mapSize][mapSize];

        StringBuilder str = new StringBuilder();

        for(int i=0; i<mapSize; i++){
            for(int j = 0; j<mapSize; j++){
                cameraStatusMap[i][j] = input.nextInt();
            }
        }

        int contador =0;

        for(int i = 0; i<mapSize-1; i++){
            for(int l = 0; l<mapSize-1; l++){    
                for(int j = 0; j<2; j++){
                    for(int k = 0; k<2;k++){
                        if(cameraStatusMap[i+j][l+k]==1){
                            contador++;
                        }
                    }
                }
                if(contador>=2){
                    str.append("S");
                } else{
                    str.append("U");
                }
                contador = 0;
            }
            str.append("\n");
        }

        System.out.print(str.toString());
    }    
}
