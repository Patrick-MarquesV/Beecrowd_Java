package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2203 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int[] data = new int[7];

        while(input.hasNext()){
            for(int i = 0; i<data.length; i++){
                data[i] = input.nextInt();
            }

            double distacia = Math.sqrt(Math.pow(data[0]-data[2], 2) + Math.pow(data[1]-data[3], 2));

            if(distacia+(data[4]*1.5) <= data[5]+data[6]){
                System.out.println("Y");
            } else{
                System.out.println("N");
            }
        }
    }    
}
