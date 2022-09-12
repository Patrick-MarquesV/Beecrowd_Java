package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2028 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int acc=1, entrada, contador, caso=0;
        
        while(input.hasNext()){
            StringBuilder str = new StringBuilder();
            caso++; 
            entrada = input.nextInt();
            contador =1;
            
            if(entrada==0){
                str.append("0\n");
            } else{
                str.append("0 ");
            }
           
            for(int i=1; i<=entrada;i++){
                contador+=i;

                for(int j=0; j<i; j++){
                    str.append(i);
                    if(i==entrada && j==i-1){
                        str.append("\n");
                    }else{
                        str.append(" ");
                    }
                }
            }
            
            if(entrada==0){
                System.out.printf("Caso %d: %d numero\n", caso, contador);
            }else{
                System.out.printf("Caso %d: %d numeros\n", caso, contador);
            }
            System.out.println(str.toString());                      
        }
    }
}
