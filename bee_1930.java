package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1930 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int sum=0;

        for(int i=0; i<4;i++){
            sum+=input.nextInt();
        }

        System.out.println(sum-3);
    }
}
