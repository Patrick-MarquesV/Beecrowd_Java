package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2143 {

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(true){
            int testCases = input.nextInt();

            if(testCases == 0){
                break;
            }

            for(int i = 0; i<testCases; i++){
                int numberOfPeople = input.nextInt();

                if(numberOfPeople%2!=0)
                    System.out.println(((numberOfPeople*2)-1));
                else
                    System.out.println(((numberOfPeople*2)-2));
            }
        }
    }
}
