package Beecrowd_Java;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_2686 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        DecimalFormat df = new DecimalFormat("00");

        while(input.hasNext()){

            double angle = input.nextDouble();

            int hora = ((int)(angle * 240) / 3600) % 60;

            int minuto = ((int)(angle * 240) / 60) % 60;

            int segundo = (int)(angle* 240) % 60;

            hora = (hora+6)%24;    

            str.append(greetings(angle));
            str.append("\n");
            str.append(df.format(hora) + ":" + df.format(minuto) + ":" + df.format(segundo));
            str.append("\n");
        }

        System.out.print(str.toString());

    } 
    
    public static String greetings(double angle){

        if(angle<90 || angle==360){
            return ("Bom Dia!!");
        } else if(angle<180){
            return ("Boa Tarde!!");
        } else if(angle<270){
            return ("Boa Noite!!");
        } else{
            return ("De Madrugada!!");
        }

    }
    
}
