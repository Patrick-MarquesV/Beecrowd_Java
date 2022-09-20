package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2221 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for(int i = 0; i<testCases; i++){
            int bonus = input.nextInt();

            int pokemonData[] = new int[6];

            for(int j = 0; j<6;j++){
                pokemonData[j] = input.nextInt();
            }

            double valueDabriel = (pokemonData[0]+pokemonData[1])/2;
            double valueGuarte = (pokemonData[3]+pokemonData[4])/2;

            if(pokemonData[2]%2==0){
                valueDabriel+=bonus;
            }
            if(pokemonData[5]%2==0){
                valueGuarte+=bonus;
            }

            if(valueDabriel>valueGuarte){
                System.out.println("Dabriel");
            } else if(valueGuarte>valueDabriel){
                System.out.println("Guarte");
            } else{
                System.out.println("Empate");
            }

        }


    }    
}
