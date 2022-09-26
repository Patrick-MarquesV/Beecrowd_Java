package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2626 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String dodo = input.next();
            String leo = input.next();
            String pepper = input.next();
            input.nextLine();
            
            verificaVencedor(dodo, leo, pepper);

        }
    } 

    public static void verificaVencedor(String dodo, String leo, String pepper){

        if((dodo.equals("papel")&&leo.equals("pedra")&&pepper.equals("pedra")) || (dodo.equals("pedra")&&leo.equals("tesoura")&&pepper.equals("tesoura"))|| (dodo.equals("tesoura")&&leo.equals("papel")&&pepper.equals("papel"))){
            System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
        } else if((leo.equals("papel")&&dodo.equals("pedra")&&pepper.equals("pedra")) || (leo.equals("pedra")&&dodo.equals("tesoura")&&pepper.equals("tesoura"))|| (leo.equals("tesoura")&&dodo.equals("papel")&&pepper.equals("papel"))){
            System.out.println("Iron Maiden's gonna get you, no matter how far!");
        } else if((pepper.equals("papel")&&leo.equals("pedra")&&dodo.equals("pedra")) || (pepper.equals("pedra")&&leo.equals("tesoura")&&dodo.equals("tesoura"))|| (pepper.equals("tesoura")&&leo.equals("papel")&&dodo.equals("papel"))){
            System.out.println("Urano perdeu algo muito precioso...");
        } else{
            System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
        }   

    }
}
