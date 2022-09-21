package Beecrowd_Java;
import java.io.*;
import java.util.Scanner;

public class bee_1827{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int arrSize, value=0;

        while(input.hasNext()){
            StringBuilder str = new StringBuilder();

            arrSize = input.nextInt();
            
            for(int i = 0; i<arrSize; i++){
                for(int j = 0; j<arrSize; j++){
                    
                    value = 0;

                    if(i==j){
                        value = 2;
                    }
                    if(i+j==arrSize-1){
                        value = 3;
                    }
                    if((j>=(arrSize/3) && i>=(arrSize/3))&&(i<arrSize-(arrSize/3) && j<arrSize-(arrSize/3))){
                        value = 1;
                    }
                    if(i==arrSize/2 && j==arrSize/2){
                        value = 4;
                    }

                    str.append(value);
                }
                str.append("\n");
            }
            System.out.print(str.toString());
            System.out.println();
        }
    }
}