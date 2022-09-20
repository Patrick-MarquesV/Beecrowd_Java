package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2176 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String[] message = input.nextLine().split("");

        int counter=0;

        for(String item : message){
            if(item.intern() == "1"){
                counter++;
            }

            System.out.print(item);
        }

        if(counter%2==0){
            System.out.println("0");
        } else{
            System.out.println("1");
        }

    }    
}
