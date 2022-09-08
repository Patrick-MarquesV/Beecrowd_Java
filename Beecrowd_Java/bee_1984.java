package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1984 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String str = new String();

        str=input.nextLine();

        String[] reverso = new String[str.length()];

        reverso = str.split("");

        for(int i = reverso.length-1; i>=0; i--){
            System.out.print(reverso[i]);
        }
        System.out.println();
    }
}
