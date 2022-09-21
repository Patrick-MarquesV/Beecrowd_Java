package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1933 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int cardA= input.nextInt(), cardB= input.nextInt();

        if(cardA>cardB){
            System.out.println(cardA);
        } else{
            System.out.println(cardB);
        }
    }
}
