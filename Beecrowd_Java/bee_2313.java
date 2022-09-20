package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2313 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int sideA, sideB, sideC;

        sideA = input.nextInt();
        sideB = input.nextInt();
        sideC = input.nextInt();

        if(sideA+sideB>sideC && sideA+sideC>sideB && sideC+sideB>sideA){
            System.out.print("Valido");

            if(sideA==sideB && sideB==sideC)
                System.out.println("-Equilatero");
            else if(sideA!=sideB && sideB!= sideC && sideC!=sideA)
                System.out.println("-Escaleno");
            else
                System.out.println("-Isoceles");
            

            if(Math.pow(sideA,2)+Math.pow(sideB,2)==Math.pow(sideC,2) || Math.pow(sideC,2)+Math.pow(sideB,2)==Math.pow(sideA,2) || Math.pow(sideA,2)+Math.pow(sideC,2)==Math.pow(sideB,2))
                System.out.println("Retangulo: S");
            else
                System.out.println("Retangulo: N");


        } else{
            System.out.println("Invalido");
        }
    }
}
