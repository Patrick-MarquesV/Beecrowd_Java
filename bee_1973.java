package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;

public class bee_1973 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int stars = input.nextInt();
        long sum=0;
        long[] sheeps = new long[stars];

        for(int i=0; i<stars; i++){
            sheeps[i] = input.nextInt();
        }
        
        stars = 0;

        try{
            for(int i=0; i<sheeps.length;){
                stars = ((i+1+stars+Math.abs(i+1-stars))/2);

                if(sheeps[i]%2!=0){
                    if(sheeps[i]>0){
                        sheeps[i]-=1;
                    }
                    i++;
                }else{
                    if(sheeps[i]>0){
                        sheeps[i]-=1;
                    }
                    i--;
                }
            }
        } catch(ArrayIndexOutOfBoundsException e){}

        for(int i=0; i<sheeps.length;i++){
            sum+=sheeps[i];
        }
        System.out.println(stars + " " + sum);
    }
}