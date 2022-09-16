package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2139{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            int month = input.nextInt();
            int day = input.nextInt();

            if(month<12)
                System.out.printf("Faltam %d dias para o natal!\n", calculaDias(month, day));
            else if(day==24)
                System.out.println("E vespera de natal!");
            else if(day==25)
                System.out.println("E natal!");
            else
                System.out.println("Ja passou!");
        }   
    }

    public static int calculaDias(int month, int day){

        int total =0;

        if(day<=25){
            total+=25-day;
        }
        else{
            total-=day-25;
            //total+=;
        }

        month = 12-month;

        switch(month){
            case 11:
                total+=31;
            case 10:
                total+=29;
            case 9:
                total+=31;
            case 8:
                total+=30;
            case 7:
                total+=31;
            case 6:
                total+=30;
            case 5:
                total+=31;
            case 4:
                total+=31;
            case 3:
                total+=30;
            case 2:
                total+=31;  
            case 1:
                total+=30;
                break;

        }     

        return total;
    }
}