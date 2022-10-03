package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2712 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String plateFormat = "[A-Z]{3}[-]{1}[0-9]{4}";

        int numberOfPlates = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfPlates; i++) {
            String plate = input.nextLine();

            if(!plate.matches(plateFormat)){
                System.out.println("FAILURE");
                continue;
            }
            
           System.out.println(verifyPlate(plate.split("")));

        }

    }

    public static String verifyPlate(String[] plate){

        int lastNumber = Integer.parseInt(plate[plate.length-1]);

        switch(lastNumber){
            case 1:
            case 2:
                return "MONDAY";
            case 3:
            case 4:
                return "TUESDAY";
            case 5:
            case 6:
                return "WEDNESDAY";
            case 7:
            case 8:
                return "THURSDAY";
            case 9:
            case 0:
                return "FRIDAY";
        }

        return "";

    }
    
}
