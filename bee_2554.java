package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_2554 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){

            int numberPeople = input.nextInt();
            int numberDates = input.nextInt();
            
            boolean noDatesPossible = true;

            int[] finalDate = {99, 99, 9999};

            for(int i = 0; i<numberDates; i++){

                String[] stringDate = input.next().replace("/", " ").split(" ");

                int[] date = new int[3];

                for(int k=0; k<3;k++){
                    date[k] = Integer.parseInt(stringDate[k]);
                }

                int opnionCounter = 0;

                for(int j=0; j<numberPeople; j++){
                    int entrada = input.nextInt();
                    if(entrada==1){
                        opnionCounter++;
                    }
                }
            
                if(opnionCounter==numberPeople){
                    if(date[2]<finalDate[2]){
                        finalDate=date;
                    } else if(date[2]==finalDate[2]){
                        if(date[1]<finalDate[1]){
                            finalDate=date;
                        } else if(date[1] == finalDate[1]){
                            if(date[0]<finalDate[0]){
                                finalDate=date;
                            }
                        }
                    }

                    noDatesPossible = false;
                }
            }

            if(noDatesPossible){
                System.out.println("Pizza antes de FdI");
            } else{
                System.out.println(finalDate[0]+"/"+finalDate[1]+"/"+finalDate[2]);
            }

        }        
    }
}
