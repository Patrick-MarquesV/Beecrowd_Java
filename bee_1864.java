package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1864{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

         String frase = new String();
         
         String[] str = new String[33];

        frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        str = frase.split("");

        int number=input.nextInt();

        for(int i=0; i<number; i++){
            System.out.print(str[i]);
        }
        System.out.println();

    }
}