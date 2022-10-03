package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2721 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int sum = 9;

        for (int i = 0; i < 9; i++) {
            sum+=input.nextInt();
        }

        switch(sum%9){
            case 0:
                System.out.println("Rudolph");
                break;
            case 1: 
                System.out.println("Dasher");
                break;
            case 2: 
                System.out.println("Dancer");
                break;
            case 3:
                System.out.println("Prancer");
                break;
            case 4:
                System.out.println("Vixen");
                break;
            case 5:
                System.out.println("Comet");
                break;
            case 6:
                System.out.println("Cupid");
                break;
            case 7:
                System.out.println("Donner");
                break;
            case 8:
                System.out.println("Blitzen");
                break;
        }
    }    
}
