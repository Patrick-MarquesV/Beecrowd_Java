package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2057 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int departureTime, travelTime, timeZone, arrival;

        departureTime = input.nextInt();
        travelTime = input.nextInt();
        timeZone = input.nextInt();

        arrival = departureTime+travelTime+timeZone;

        if(arrival>=24){
            arrival-=24;
        } else if(arrival<0){
            arrival+=24;
        }

        System.out.println(arrival);


    }
}
