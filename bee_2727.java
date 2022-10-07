package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2727 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        while(input.hasNext()){

            int testCases = input.nextInt();
            input.nextLine();

            for (int i = 0; i < testCases; i++) {
                
                String[] code = input.nextLine().split(" ");

                int letterPosition = ((code[0].length() - 1) + (code.length-1)*3); //posição +
                
                System.out.println(alphabet.charAt(letterPosition));

            } 

        }
    }    
}
