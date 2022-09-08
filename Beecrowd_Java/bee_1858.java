package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1858{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int people=input.nextInt(), hits, guess=20, position=0;


        for(int i=1; i<=people; i++){
            hits = input.nextInt();
            if(hits<guess){
                guess = hits;
                position = i;
            }
        }
        System.out.println(position);        
    }
}