package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1929 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if((a+b>c && a+c>b && b+c>a)||(a+b>d && a+d>b && b+d>a)||(a+c>d && a+d>c && c+d>a)||(b+c>d && b+d>c && c+d>b)){
            System.out.println("S");
        } else{
            System.out.println("N");
        }

    }
}
