package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2670 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int[] andares = new int[3];

        for(int i=0; i<3;i++){
            andares[i]=input.nextInt();
        }

        int menor = andares[1]*2+andares[2]*4;

        if(andares[0]*2+andares[2]*2<menor){
            menor = andares[0]*2+andares[2]*2;
        }
        
        if(andares[0]*4+andares[1]*2<menor){
            menor = andares[0]*4+andares[1]*2;
        }

        System.out.println(menor);

    }    
}
