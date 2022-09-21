import java.io.IOException;
import java.util.Scanner;

public class bee_2520 {
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            int numbersRows = input.nextInt();
            int numberColumn = input.nextInt();

            int distance = 0;

            int[] pokemonPosition={0,0}, playerPosition={0,0};

            int[][] map = new int[numbersRows][numberColumn];

            for(int i = 0; i<numbersRows; i++){
                for(int j = 0; j<numberColumn; j++){
                    map[i][j] = input.nextInt();
                    
                    if(map[i][j]==2){
                        pokemonPosition[0]=i;
                        pokemonPosition[1]=j;
                    } else if(map[i][j]==1){
                        playerPosition[0]=i;
                        playerPosition[1]=j;
                    }

                }
            }

            distance = (Math.abs(pokemonPosition[0]-playerPosition[0])+Math.abs(pokemonPosition[1]-playerPosition[1]));

            System.out.println(distance);

        }
    }
}
