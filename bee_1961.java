package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class bee_1961 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int jumpHeight, numPipes, nextPipe, actualPipe;

        jumpHeight = input.nextInt();
        numPipes = input.nextInt();

        actualPipe = input.nextInt();

        for(int i=1; i<numPipes;i++){
            nextPipe = input.nextInt();

            if(Math.abs(nextPipe-actualPipe)>jumpHeight){
                System.out.println("GAME OVER");
                break;
            } else if(i==numPipes-1){
                System.out.println("YOU WIN");
            }

            actualPipe = nextPipe;
        }    
    }
}
