package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2006 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int answer = input.nextInt(), guess, acumulador=0;

        for(int i=0; i<5;i++){
            guess=input.nextInt();

            if(guess == answer){
                acumulador++;
            }
        }
        System.out.println(acumulador);
    }
}
