package Beecrowd_Java;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_2152 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for(int i = 0; i<testCases; i++){
            int hour = input.nextInt();
            int minutes = input.nextInt();
            int fechadoAberto = input.nextInt();

            DecimalFormat d = new DecimalFormat("00");

            String statusPorta = fechadoAberto==0 ? " - A porta fechou!" : " - A porta abriu!";

            System.out.println(d.format(hour)+ ":" + d.format(minutes) + statusPorta);



        }


    }
}
