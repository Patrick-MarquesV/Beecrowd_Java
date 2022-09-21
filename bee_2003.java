package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2003 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String str = new String();

        while(input.hasNextLine()){
            str = input.nextLine();
            String[] time = new String[2];
            int hour, minutes;
            
            time = str.split(":");

            hour=Integer.parseInt(time[0]);
            minutes = Integer.parseInt(time[1]);

            hour++;

            if(hour>8){
                System.out.println("Atraso maximo: "+((hour-8)*60+minutes));
            } else if (hour==8){
                System.out.println("Atraso maximo: "+minutes);
            } else{
                System.out.println("Atraso maximo: 0");
            }

        }



    }
}
