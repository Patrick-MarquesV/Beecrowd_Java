package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;


public class bee_1837 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int dividend=input.nextInt(), divisor=input.nextInt(), q=0, r=-1;
        
        if(dividend<0 && divisor<0){
            for(int i = dividend; r<0; i+=0){
                i-=divisor;
                r=i;
                q++;
            }
        } else if(dividend<0 && divisor>0){
            for(int i = dividend; r<0; i+=0){
                i+=divisor;
                r=i;
                q--;
            }
        } else {
            q=dividend/divisor;
            r = dividend-(divisor*q);
        }

        System.out.printf("%d %d\n", q , r);

    }
}
