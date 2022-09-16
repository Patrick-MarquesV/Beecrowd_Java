package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2165 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String tweet = input.nextLine();

        if(tweet.length() <= 141){
            System.out.println("TWEET");
        } else{
            System.out.println("MUTE");
        }
    }
}
