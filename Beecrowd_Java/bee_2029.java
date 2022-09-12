package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class bee_2029 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            double volume, diameter;

            volume = input.nextDouble();
            diameter = input.nextDouble();

            System.out.println("ALTURA = " + new DecimalFormat("0.00").format((volume/(3.14*diameter*diameter/4))));
            System.out.println("AREA = " + new DecimalFormat("0.00").format((3.14*diameter*diameter/4)));
        }

    }
}
