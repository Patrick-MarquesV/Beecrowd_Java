package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2708 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int pessoas = 0, jeep = 0;

        while(true){

            String entradaSaida = input.next();
            if(entradaSaida.equals("ABEND")) break;
            
            int tourist = input.nextInt();

            if(entradaSaida.equals("SALIDA")){
                jeep++;
                pessoas+=tourist;
            }

            if(entradaSaida.equals("VUELTA")){
                jeep--;
                pessoas-=tourist;
            }
        }

        System.out.println(pessoas);
        System.out.println(jeep);
    }
}
