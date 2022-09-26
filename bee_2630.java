package Beecrowd_Java;
import java.util.Scanner;
import java.io.IOException;

public class bee_2630 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for(int i = 0; i<testCases; i++){
            String conversionType = input.next();

            int R = input.nextInt();
            int G = input.nextInt();
            int B = input.nextInt();
            
            int pixelGreyLevel = pixelGreyLevel(conversionType, R, G, B);

            System.out.println("Caso #"+(i+1)+": "+ pixelGreyLevel);
        }
    }

    private static int pixelGreyLevel(String conversionType, int r, int g, int b) {
        
        if(conversionType.equals("eye"))
            return (int) (0.30*r+0.59*g+0.11*b);
        else if(conversionType.equals("mean"))
            return (int) ((r+g+b)/3);
        else if(conversionType.equals("min"))
            return calculaMin(r,g,b);
        else if(conversionType.equals("max"))
            return calculaMax(r, g, b);

        return 0;
    }

    private static int calculaMin(int r, int g, int b) {
        
        int menorRG, menorRGB;

        menorRG = (r + g - Math.abs(r-g))/2;
        menorRGB = (menorRG+b-Math.abs(menorRG-b))/2;        
        
        return menorRGB;
    } 

    private static int calculaMax(int r, int g, int b) {
        
        int maiorRG, maiorRGB;

        maiorRG = (r + g + Math.abs(r-g))/2;
        maiorRGB = (maiorRG+b+Math.abs(maiorRG-b))/2;        
        
        return maiorRGB;
    } 


}
