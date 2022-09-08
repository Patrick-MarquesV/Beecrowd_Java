package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1848{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String str = new String();

        String[] arr = new String[3];

        int contador=0, soma=0;

        while(contador<3){
            str = input.nextLine().intern();
            
            arr = str.split("");

            if("*"==arr[0].intern()){
                soma+=4;
            } 
            if("*"==arr[1].intern()){
                soma+=2;
            } 
            if("*"==arr[2].intern()){
                soma++;
            } 
            
            if("caw caw" == str){
                contador++;
                System.out.println(soma);
                soma=0;
            }            
        }
    }
}