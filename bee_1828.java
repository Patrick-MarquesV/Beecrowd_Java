package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1828{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(), caso = 1;
        String sheldon, raj;

        for(int i = 0; i<number ; i++){
            sheldon = input.next().intern();
            raj = input.next().intern();

            System.out.printf("Caso #%d: ", caso);

            if(sheldon == raj){
                System.out.println("De novo!");
            } else if ((sheldon=="tesoura" && raj=="papel") || (sheldon=="papel" && raj=="pedra")||(sheldon=="pedra" && raj=="lagarto")||(sheldon=="lagarto" && raj=="Spock")||(sheldon=="Spock" && raj=="tesoura")||(sheldon=="tesoura" && raj=="lagarto")||(sheldon=="lagarto" && raj=="papel")||(sheldon=="papel" && raj=="Spock")||(sheldon=="Spock" && raj=="pedra")||(sheldon=="pedra" && raj=="tesoura")){
                System.out.println("Bazinga!");
            } else{
                System.out.println("Raj trapaceou!");
            }


            caso++;
        }

    }
}