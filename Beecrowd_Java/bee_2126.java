package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2126{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        int caso = 1;
        
        while(input.hasNext()){
            
            int subsequencias=0, indiceArr1=0, posicaoSubsequencia=0;
            
            String[] arr1 = input.nextLine().split("");
            String[] arr2 = input.nextLine().split("");
        
            for(int j = 0; j<arr2.length;j++){
                
                if(arr2[j].intern() == arr1[indiceArr1].intern()){
                    indiceArr1++;
                    
                    if(indiceArr1==arr1.length){
                        subsequencias++;
                        indiceArr1=0;
                        j-=arr1.length-1;
                        posicaoSubsequencia = j+1;
                    }
                    
                }else if(indiceArr1>0){
                    indiceArr1=0;
                    j--;
                }else{
                    indiceArr1=0;
                }
            }
            
            System.out.printf("Caso #%d:\n", caso);
            if(subsequencias>0){
                System.out.println("Qtd.Subsequencias: " + subsequencias);
                System.out.println("Pos: " + posicaoSubsequencia);
            } else{
                System.out.println("Nao existe subsequencia");
            }
            System.out.println();
            caso++;
        } 
    }
}
