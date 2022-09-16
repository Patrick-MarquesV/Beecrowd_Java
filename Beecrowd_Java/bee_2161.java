package Beecrowd_Java;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_2161 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int numberRepetitions = input.nextInt();
        
        double fracao = 6;

        for(int i = 1 ; i<numberRepetitions; i++){
            fracao = (6+(1/fracao));
        }

        fracao = 1/fracao;

        DecimalFormat df = new DecimalFormat("0.0000000000");

        double resposta = 3;

        if(numberRepetitions == 1)
            resposta+=(1/6.0);
        else if(numberRepetitions > 1)
            resposta+=fracao;

        System.out.println(df.format(resposta));
        
    }
}

