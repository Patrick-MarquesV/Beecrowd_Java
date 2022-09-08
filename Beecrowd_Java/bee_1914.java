package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1914 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number=input.nextInt(), n1, n2;

        String name1 = new String(), choise1 = new String(),name2 = new String(), choise2 = new String();

        for(int i=0; i<number;i++){
            name1 = input.next();
            choise1 = input.next();
            name2 = input.next();
            choise2 = input.next();

            n1 = input.nextInt();
            n2 = input.nextInt();

            if((n1+n2)%2==0){
                if(choise1.intern() == "PAR"){
                    System.out.println(name1);
                } else {
                    System.out.println(name2);
                }
            } else{
                if(choise1.intern() == "IMPAR"){
                    System.out.println(name1);
                } else{
                    System.out.println(name2);
                }
            }



        }

    }    
}
