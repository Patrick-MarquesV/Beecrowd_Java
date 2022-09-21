package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2061 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int tabs=input.nextInt(), actions=input.nextInt();

        String str;

        for(int i = 0; i<actions; i++){
            str = input.next();

            if(str.intern()=="fechou"){
                tabs++;
            } else if(str.intern() == "clicou"){
                tabs--;
            }

            if(tabs==0){
                break;
            }
        }
        System.out.println(tabs);
    }
}
