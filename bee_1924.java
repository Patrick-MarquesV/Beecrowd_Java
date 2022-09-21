package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1924 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String course = new String();

        int number = input.nextInt();

        for(int i=0; i<number; i++){
            course = input.nextLine();
        }

        System.out.println("Ciencia da Computacao");


    }
}
