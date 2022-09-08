package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1985 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number = input.nextInt(), id, qtd;
        float total=0;

        for(int i=0; i<number; i++){
            id = input.nextInt();
            qtd = input.nextInt();

            switch(id){
                case 1001:
                    total+=1.50f*qtd;
                    break;
                case 1002:
                    total+=2.50f*qtd;
                    break;
                case 1003:
                    total+=3.50f*qtd;
                    break;
                case 1004:
                    total+=4.50f*qtd;
                    break;
                case 1005:
                    total+=5.50f*qtd;
                    break;
                default:
                    System.out.println("ID inválido");  
            }
        }

        System.out.printf("%.2f\n", total);

    }
}
