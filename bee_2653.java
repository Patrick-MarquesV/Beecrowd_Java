package Beecrowd_Java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class bee_2653 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int numberOfJewels = 0;

        ArrayList<String> dijkstraJewels = new ArrayList<String>();

        while(input.hasNext()){

            String newJewel = input.nextLine();

            if(!dijkstraJewels.contains(newJewel)){
                dijkstraJewels.add(newJewel);
                numberOfJewels++;
            }
        }

        System.out.println(numberOfJewels);

    }
}
