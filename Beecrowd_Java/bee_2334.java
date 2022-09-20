package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;
import java.math.BigInteger;

public class bee_2334 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String ducks = input.nextLine();

        BigInteger bi = new BigInteger(ducks);

        BigInteger minusOne = new BigInteger("-1");

        while(!BigInteger.valueOf(-1).equals(bi)){

            if(BigInteger.valueOf(0).compareTo(bi) == 0){
                System.out.println(0);
            } else{
                System.out.println(bi.add(minusOne));
            }

            ducks = input.nextLine();
            bi = new BigInteger(ducks);
        }

    }
}
