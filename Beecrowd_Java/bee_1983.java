package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1983 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(), id=0, chosenId=0;
        float nota, maiorNota=0;

        for(int i=0; i<number; i++){
            id = input.nextInt();
            nota = input.nextFloat();
            if(nota>maiorNota){
                maiorNota = nota;
                chosenId=id;
            }
        }
        if(maiorNota>=8){
            System.out.println(chosenId);
        } else{
            System.out.println("Minimum note not reached");
        }

    }
}
