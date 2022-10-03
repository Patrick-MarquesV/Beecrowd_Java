package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2724 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        String especialCaracteres = "e1234567890l";

        for (int i = 0; i < testCases; i++) {
            
            int possibleCompounds = input.nextInt();
            input.nextLine();

            String[] listCompounds = new String[possibleCompounds];

            for(int j = 0; j < possibleCompounds; j++) {
                listCompounds[j] = input.nextLine();
            }

            int NumberMixtures = input.nextInt();
            input.nextLine();

            for (int j = 0; j < NumberMixtures; j++) {
                String listMixtures = input.nextLine();

                boolean contains = false;

                for (String item : listCompounds) {
                    contains = listMixtures.indexOf(item) >= 0 ? true : false;

                    String nextChar="";

                    if(listMixtures.length() > listMixtures.indexOf(item)+item.length()) {
                        
                        nextChar = String.valueOf(listMixtures.charAt(listMixtures.indexOf(item)+item.length()));

                        if(especialCaracteres.indexOf(nextChar) >=0) contains = false;    
                        
                    }
                    
                    if(contains)break;
                }

                if(contains) System.out.println("Abortar");
                else System.out.println("Prossiga");

            }
            if(i<testCases-1) System.out.println();
        }
    }    
}
