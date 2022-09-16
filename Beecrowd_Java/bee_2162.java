package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2162 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int numberOfMeasures = input.nextInt();
        int contaPico = 0, contaVale = 0;

        int[] landscapeMeasures = new int[numberOfMeasures];
        
        landscapeMeasures[0] = input.nextInt();

        for(int i=1; i<numberOfMeasures; i++){
            landscapeMeasures[i] = input.nextInt();

            if(landscapeMeasures[i]>landscapeMeasures[i-1]){
                contaPico++;
                contaVale=0;
            }
            if(landscapeMeasures[i]<landscapeMeasures[i-1]){
                contaVale++;
                contaPico=0;
            }
                
            if(contaPico==2 || contaVale==2 || landscapeMeasures[i]==landscapeMeasures[i-1]){
                System.out.println(0);
                System.exit(0);
            }
        }

        System.out.println(1);

    }
}
