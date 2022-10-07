package Beecrowd_Java;
import java.io.IOException;

public class bee_2753 {
    public static void main(String[] args) throws IOException{

        StringBuilder str = new StringBuilder();
    
       int charValue = 97;

        for (int i = 97; i <=122; i++) {
            
            str.append(i+ " e " + (char) charValue++ + "\n");

        }

        System.out.print(str.toString());

    }    
}
