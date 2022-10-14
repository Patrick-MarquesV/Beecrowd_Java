package Beecrowd_Java;

import java.io.IOException;
import java.util.Scanner;

public class bee_2757 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.printf("A = %d, B = %d, C = %d\n", a, b, c);
        System.out.printf("A = %10d, B = %10d, C = %10d\n", a, b, c);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", a, b, c);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", a, b, c);
        

    }   
}
