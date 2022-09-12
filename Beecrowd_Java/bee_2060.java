package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2060 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int tests=input.nextInt(), number, m2=0, m3=0, m4=0, m5=0;

        for(int i = 0; i<tests;i++){
            number = input.nextInt();

            if(number%2==0){
                m2++;
            }
            if(number%3==0){
                m3++;
            }
            if(number%4==0){
                m4++;
            }
            if(number%5==0){
                m5++;
            }
        }
        System.out.println(m2+ " Multiplo(s) de 2");
        System.out.println(m3+ " Multiplo(s) de 3");
        System.out.println(m4+ " Multiplo(s) de 4");
        System.out.println(m5+ " Multiplo(s) de 5");
    }
}
