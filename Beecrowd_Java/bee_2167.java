package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2167 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int speedMeasures = input.nextInt(), position=0;

        int[] arrayMeasures = new int[speedMeasures];

        boolean firstPositionControl = true;

        arrayMeasures[0]=input.nextInt();

        for(int i = 1; i<arrayMeasures.length; i++){
            arrayMeasures[i]=input.nextInt();

            if(arrayMeasures[i]<arrayMeasures[i-1] &&  firstPositionControl){
                position = (i+1);
                firstPositionControl = false;                
            }
        }

        System.out.println(position);

    }
}
