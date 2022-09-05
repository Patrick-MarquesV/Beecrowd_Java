package Beecrowd_Java;
import java.io.*;
import java.util.Scanner;

public class bee_1827{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        int arrSize, value=0;

        while(input.hasNext()){
            arrSize = input.nextInt();

            for(int i = 0; i<arrSize; i++){
                for(int j = 0; j<arrSize; j++){

                    if(i==j){
                        value = 1;
                    }



                    str.append(value);
                }
            }
            str.append("\n");
        }
        System.out.print(str.toString());

    }
}