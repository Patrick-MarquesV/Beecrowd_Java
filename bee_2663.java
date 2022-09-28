package Beecrowd_Java;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class bee_2663 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int candidatos = input.nextInt();

        int numeroDevagas = input.nextInt();

        int totalClassificados = numeroDevagas;

        int[] listaDeCandidatos = new int[candidatos];

        for(int i = 0; i<candidatos; i++){
            listaDeCandidatos[i] = input.nextInt();
        }

        Arrays.sort(listaDeCandidatos);

        for(int i = 0; i <listaDeCandidatos.length-numeroDevagas; i++){

            if(listaDeCandidatos[listaDeCandidatos.length-numeroDevagas]==listaDeCandidatos[i])
                totalClassificados++;

        }

        System.out.println(totalClassificados);

    }    
}
