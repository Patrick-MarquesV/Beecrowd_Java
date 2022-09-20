package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2486 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int dailyIntake = input.nextInt();

        while(dailyIntake != 0){

            int vitaminQuantity = 0;

            for(int i = 0; i<dailyIntake; i++){

                int foodAmount = input.nextInt();
                String foodName = input.nextLine();

                foodName = foodName.trim();

                //System.out.println(foodAmount + " " + foodName);                

                vitaminQuantity+= vitaminCcalculator(foodName, foodAmount);                

            }

            if(vitaminQuantity>130)
                System.out.println("Menos " + (vitaminQuantity-130) + " mg");
            else if(vitaminQuantity<110)
                System.out.println("Mais "+(110-vitaminQuantity)+" mg");
            else
                System.out.println(vitaminQuantity+" mg");

            dailyIntake = input.nextInt();
        }


    }

    public static int vitaminCcalculator(String food, int quantity){

        if(food.intern() == "suco de laranja")
            return 120*quantity;
        else if(food.intern() == "morango fresco" || food.intern() == "mamao")
            return 85*quantity;
        else if(food.intern() == "goiaba vermelha")
            return 70*quantity;
        else if(food.intern() == "manga")
            return 56*quantity;
        else if(food.intern() == "laranja")
            return 50*quantity;
        else if(food.intern() == "brocolis")
            return 34*quantity;

        return 0;
    }

}
