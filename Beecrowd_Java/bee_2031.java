package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2031 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number=input.nextInt();
        String p1, p2;

        for(int i=0; i<number; i++){
            p1 = input.next().intern();
            p2 = input.next().intern();

            if((p1=="ataque"&&p2!="ataque") || (p1=="pedra"&&p2=="papel")){
                System.out.println("Jogador 1 venceu");
            } else if(p1=="papel"&&p2=="papel"){
                System.out.println("Ambos venceram");
            } else if(p1=="pedra"&&p2 == "pedra"){
                System.out.println("Sem ganhador");
            } else if(p1=="ataque"&&p2=="ataque"){
                System.out.println("Aniquilacao mutua");
            } else{
                System.out.println("Jogador 2 venceu");
            }
        }
    }
}
