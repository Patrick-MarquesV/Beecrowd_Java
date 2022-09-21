package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2502 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int stringSize = input.nextInt();
            int numberLines = input.nextInt();
            input.nextLine();

            StringBuilder cifra = new StringBuilder();

            for(int i=0; i<2;i++){
                cifra.append(input.nextLine());
            }

            String[] arrayCrifra = cifra.toString().split("");

            StringBuilder fraseCifrada = new StringBuilder();

            for(int i=0; i<numberLines; i++){
                fraseCifrada.append(input.nextLine());
                fraseCifrada.append("\n");
            }

            StringBuilder fraseDecifrada = new StringBuilder();

            for(int i=0; i<fraseCifrada.toString().length(); i++){

                int charIndex = cifra.toString().indexOf(fraseCifrada.toString().toUpperCase().charAt(i));

                if(charIndex>=0){
                    
                    if(charIndex>=stringSize)
                        charIndex-=stringSize;
                    else
                        charIndex+=stringSize;
                
                    int ascii = (int) fraseCifrada.toString().charAt(i);

                    if(ascii >=65 && ascii<=90)               
                        fraseDecifrada.append(arrayCrifra[charIndex].toUpperCase());
                    else
                        fraseDecifrada.append(arrayCrifra[charIndex].toLowerCase());

                } else{
                    fraseDecifrada.append(fraseCifrada.charAt(i));
                }
            }

            System.out.println(fraseDecifrada.toString());
        }
    }    
}
