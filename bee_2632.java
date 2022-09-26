package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2632 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        int testCases = input.nextInt();

        for(int i = 0; i<testCases; i++){

            int rectangleWidth = input.nextInt();
            int rectangleHeight = input.nextInt();

            int rectangleCordX = input.nextInt();
            int rectangleCordY = input.nextInt();

            String spelltype = input.next();

            int spellLevel = input.nextInt();
            int spellCordX = input.nextInt();
            int spellCordY = input.nextInt();


            int spellRadius = radius(spelltype, spellLevel);

            boolean ataqueEfetivo = verifyAreaRectangleSpell(rectangleWidth, rectangleHeight, rectangleCordX, rectangleCordY, spellCordX, spellCordY, spellRadius);

            if(ataqueEfetivo){
                str.append(calculateDamage(spelltype, spellLevel));
            } else{
                str.append(0);
            }
            str.append("\n");
        }
        System.out.print(str.toString());
    }

    private static int calculateDamage(String spelltype, int spellLevel) {

        if(spelltype.equals("fire")){
            return 200;
        }

        if(spelltype.equals("water")){
            return 300;
        }

        if(spelltype.equals("earth")){
            return 400;
        }

        if(spelltype.equals("air")){
            return 100;
        }

        return 0;

    }
    
    private static boolean verifyAreaRectangleSpell(int rectangleWidth, int rectangleHeight, int rectangleCordX,
            int rectangleCordY, int spellCordX, int spellCordY, int spellRadius) {         

            for(int y = rectangleCordY; y<=rectangleCordY+rectangleHeight;y++){
                for(int x = rectangleCordX; x<=rectangleCordX+rectangleWidth;x++){
                    double leftSide = Math.pow((x - spellCordX), 2) + Math.pow((y-spellCordY), 2);
                    double rightSide = Math.pow(spellRadius, 2);
                    if(leftSide <= rightSide){
                        return true;
                    }   
                }
            }
            
        return false;
    }

    private static int radius(String spelltype, int spellLevel) {
        if(spelltype.equals("fire")){
            switch(spellLevel){
                case 1:
                    return 20;
                case 2:
                    return 30;
                case 3:
                    return 50;
            }
        }

        if(spelltype.equals("water")){
            switch(spellLevel){
                case 1:
                    return 10;
                case 2:
                    return 25;
                case 3:
                    return 40;
            }
        }

        if(spelltype.equals("earth")){
            switch(spellLevel){
                case 1:
                    return 25;
                case 2:
                    return 55;
                case 3:
                    return 70;
            }
        }

        if(spelltype.equals("air")){
            switch(spellLevel){
                case 1:
                    return 18;
                case 2:
                    return 38;
                case 3:
                    return 60;
            }
        }

        return 0;
    }
}
