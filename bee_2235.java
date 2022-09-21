package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2235 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int year1 = input.nextInt(), year2=input.nextInt(), year3=input.nextInt();

        if(year1==year2 || year1==year3 || year2==year3 || year1+year2==year3 || year1+year3==year2 || year2+year3==year1)
            System.out.println("S");
        else
            System.out.println("N");

    }    
}
