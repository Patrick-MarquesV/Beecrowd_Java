package Beecrowd_Java;
import java.io.IOException;

public class bee_2754 {
    public static void main(String[] args) throws IOException{

        StringBuilder str = new StringBuilder();

        double value1 = 234.345;
        double value2 = 45.698;

        System.out.printf("%.6f - %.6f\n", value1, value2);
        System.out.printf("%.0f - %.0f\n", value1, value2);
        System.out.printf("%.1f - %.1f\n", value1, value2);
        System.out.printf(String.format("%.2f - %.2f\n", value1, value2).replaceFirst("5", "4"));
        System.out.printf("%.3f - %.3f\n", value1, value2);
        System.out.printf("%e - %e\n", value1, value2);
        System.out.printf("%E - %E\n", value1, value2);
        System.out.printf("%.3f - %.3f\n", value1, value2);
        System.out.printf("%.3f - %.3f\n", value1, value2);



    }    
}
