package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1962{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        long years;

        for(int i=0;i<number;i++){
            years = input.nextLong();

            if(years <= 2014){
                System.out.println((2015-years)+" D.C.");
            } else{
                System.out.println((years-2014) + " A.C.");
            }            
        }
    }
}