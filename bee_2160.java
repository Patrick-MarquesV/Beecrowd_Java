package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2160 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String userName = input.nextLine();

        String itFits = userName.length()<=80? "YES" : "NO";

        System.out.println(itFits);

    }
}
