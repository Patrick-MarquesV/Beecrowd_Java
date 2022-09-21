package Beecrowd_Java;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_2166 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int precisionRootTwo = input.nextInt();

        double result = 1, fraction = 2;

        DecimalFormat df = new DecimalFormat("0.0000000000");

        for(int i = 1; i < precisionRootTwo ; i++){
            fraction = 2+(1/fraction);
        }

        if(precisionRootTwo == 1){
            result+=0.5;
        } else if (precisionRootTwo > 0){
            result+= 1/fraction;
        }

        System.out.println(df.format(result));

    }    
}
