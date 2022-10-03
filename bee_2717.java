package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2717 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int timeLeft = input.nextInt();

        int timeNeeded= input.nextInt();

        timeNeeded+= input.nextInt();

        if(timeNeeded>timeLeft){
            System.out.println("Deixa para amanha!");
        } else System.out.println("Farei hoje!");

    }    
}
