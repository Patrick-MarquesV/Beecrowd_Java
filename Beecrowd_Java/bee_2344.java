package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2344 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int nota = input.nextInt();

        if(nota==0)
            System.out.println("E");
        else if(nota<=35)
            System.out.println("D");
        else if(nota<=60)
            System.out.println("C");
        else if(nota<=85)
            System.out.println("B");
        else
            System.out.println("A");
            
    }    
}
