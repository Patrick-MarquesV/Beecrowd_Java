package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;


public class bee_1960 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int number=input.nextInt(), centena, dezena, unidade;

        StringBuilder str = new StringBuilder();

        centena = number/100;
        dezena = (number-centena*100)/10;
        unidade = number - (centena*100) - (dezena*10);

        //CENTENA
        if(centena>0){
            if(centena<=3){
                for(int i=0; i<centena;i++){
                    str.append("C");
                }
            } else if(centena==4){
                str.append("CD");
            } else if(centena<=8){
                str.append("D");
                for(int i=centena; i>5; i--){
                    str.append("C");
                }
            }else if(centena==9){
                str.append("CM");
            }
        }
        
        //DEZENA
        if(dezena>0){
            if(dezena<=3){
                for(int i=0; i<dezena;i++){
                    str.append("X");
                }
            } else if(dezena==4){
                str.append("XL");
            } else if(dezena<=8){
                str.append("L");
                for(int i=dezena; i>5; i--){
                    str.append("X");
                }
            }else if(dezena==9){
                str.append("XC");
            }
        }

        //UNIDADE
        if(unidade>0){
            if(unidade<=3){
                for(int i=0; i<unidade;i++){
                    str.append("I");
                }
            } else if(unidade==4){
                str.append("IV");
            } else if(unidade<=8){
                str.append("V");
                for(int i=unidade; i>5; i--){
                    str.append("I");
                }
            }else if(unidade==9){
                str.append("IX");
            }
        }

        System.out.println(str.toString());

    }
}
