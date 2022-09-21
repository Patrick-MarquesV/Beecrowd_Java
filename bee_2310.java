package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2310 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int numberPlayers = input.nextInt();

        int[] attempts = {0, 0, 0};
        int[] success = {0, 0, 0};

        for(int i=0; i<numberPlayers; i++){
            input.nextLine();
            String playerName = input.nextLine();

            for(int j=0; j<3;j++){
                attempts[j]+=input.nextInt();
            }

            for(int j=0; j<3;j++){
                success[j]+=input.nextInt();
            }
        }

        System.out.printf("Pontos de Saque: %.2f %%.\n", (float) success[0]/attempts[0]*100);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", (float) success[1]/attempts[1]*100);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", (float) success[2]/attempts[2]*100);


    }    
}
