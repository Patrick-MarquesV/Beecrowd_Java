package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1865 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(), forca;
        String nome = new String();

        for(int i=0; i<number; i++){
            nome = input.next();
            forca = input.nextInt();

            if("Thor"==nome.intern()){
                System.out.println("Y");
            } else{
                System.out.println("N");
            }
        }

    }
}
