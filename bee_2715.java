package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2715 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        while(input.hasNext()){

            int numberAssignments = input.nextInt();

            long sum1 =0, sum2=0, diference = 0;

            int[] assignements = new int[numberAssignments];

            for (int i = 0; i < assignements.length; i++) {
                assignements[i] = input.nextInt();
                sum1+=assignements[i];
            }

            long menor = Integer.MAX_VALUE-1;
            int controle=0;
            boolean teste=false;
            
            for (int i = numberAssignments-1; i >=0 ; i--) {

                sum1-= assignements[i];
                sum2+= assignements[i];

                diference = Math.abs(sum1-sum2);

                if(diference<menor) {
                    menor = diference;
                    teste = true;
                }

                if(teste && diference>menor) controle++;

                if(controle==2 || menor==0) break;
            }

            str.append(menor);
            str.append("\n");

        }

        System.out.print(str.toString());

    }    
}
