package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2059 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int oddEven, p1, p2, cheated, accused;

        oddEven = input.nextInt();
        p1 = input.nextInt();
        p2 = input.nextInt();
        cheated = input.nextInt();
        accused = input.nextInt();

        if(cheated==1 && accused==0){
            System.out.println("Jogador 1 ganha!");
        } else if(cheated==1 && accused==1){
            System.out.println("Jogador 2 ganha!");
        } else if(cheated==0 && accused==1){
            System.out.println("Jogador 1 ganha!");
        } else{
            if(oddEven==1){
                if((p1+p2)%2==0){
                    System.out.println("Jogador 1 ganha!");
                } else{
                    System.out.println("Jogador 2 ganha!");
                }
            } else {
                if((p1+p2)%2!=0){
                    System.out.println("Jogador 1 ganha!");
                } else{
                    System.out.println("Jogador 2 ganha!");
                }
            }
        }
    }
}
