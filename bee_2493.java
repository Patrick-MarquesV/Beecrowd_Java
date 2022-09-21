package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class bee_2493 { 
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            StringBuilder testCase = new StringBuilder();
            StringBuilder playersBlocked = new StringBuilder();

            int numOperations = input.nextInt();
            input.nextLine();
                      
            for(int i = 0; i<numOperations; i++){
                testCase.append(input.nextLine().replace("=", " "));
                testCase.append(" ");              
            }

            String[] caseArray= testCase.toString().replace("  ", " ").trim().split(" ");

            int[] numericCaseArray = new int[caseArray.length];

            for(int i = 0; i<numericCaseArray.length;i++){
                numericCaseArray[i] = Integer.parseInt(caseArray[i].trim());
            }

            for(int i = 0; i<numOperations; i++){
                String playerAnswer;

                playerAnswer = input.nextLine();
                
                String[] answerArray = playerAnswer.split(" ");

                int index = Integer.parseInt(answerArray[1])-1;

                if(answerArray[2].equals("+")){

                    if(!(numericCaseArray[index*3] + numericCaseArray[index*3+1] == numericCaseArray[index*3+2]))
                        playersBlocked.append(answerArray[0] + " ");

                }else if(answerArray[2].equals("-")){

                    if(!(numericCaseArray[index*3] - numericCaseArray[index*3+1] == numericCaseArray[index*3+2]))
                        playersBlocked.append(answerArray[0] + " ");

                }else if(answerArray[2].equals("*")){

                    if(!(numericCaseArray[index*3] * numericCaseArray[index*3+1] == numericCaseArray[index*3+2]))
                        playersBlocked.append(answerArray[0] + " ");
                } else{

                    if((numericCaseArray[index*3] + numericCaseArray[index*3+1] == numericCaseArray[index*3+2])||(numericCaseArray[index*3] - numericCaseArray[index*3+1] == numericCaseArray[index*3+2])||(numericCaseArray[index*3] * numericCaseArray[index*3+1] == numericCaseArray[index*3+2]))
                        playersBlocked.append(answerArray[0] + " ");
                }        
            }
        
            if(playersBlocked.toString().trim().replace(" ", "").equals("")){
                System.out.println("You Shall All Pass!");
            } else  if(playersBlocked.toString().trim().split(" ").length == numOperations){
                System.out.println("None Shall Pass!");
            } else {
                String[] lexicographicalOrder = playersBlocked.toString().trim().split(" ");

                Arrays.sort(lexicographicalOrder);
                
                System.out.println(Arrays.toString(lexicographicalOrder).replace(",", "").replace("[", "").replace("]", ""));
            }
        }
    }
}
