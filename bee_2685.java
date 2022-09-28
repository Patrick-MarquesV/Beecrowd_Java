package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2685 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        while(input.hasNext()){

            int sunMoonAngle = input.nextInt();

            if(sunMoonAngle<90 || sunMoonAngle==360){
                str.append("Bom Dia!!");
            } else if(sunMoonAngle<180){
                str.append("Boa Tarde!!");
            } else if(sunMoonAngle<270){
                str.append("Boa Noite!!");
            } else{
                str.append("De Madrugada!!");
            }

            str.append("\n");
            
        }

        System.out.print(str.toString());

    }
}
