package Beecrowd_Java;
import java.io.IOException;
import java.util.Scanner;

public class bee_1847{
    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int t1=1, t2, t3, dif12, dif23;
    
        t1 = input.nextInt();
        t2 = input.nextInt();
        t3 = input.nextInt();

        dif12 = t2-t1;// se == 0 const, se <0 decresce, se >0 cresce;
        dif23 = t3-t2;// se == 0 const, se <0 decresce, se >0 cresce;

        if((dif12<0 && dif23>=0)||(dif12>0 && dif23>0 && dif23>=dif12)||(dif12<0 && dif23<0 && dif23>dif12)||(dif12==0 && dif23>0)){
            happy();
        } else if((dif12>0 && dif23<=0)||(dif12>0 && dif23>0 && dif23<dif12)||(dif12<0 && dif23<0 && dif23<=dif12)||(dif12==0 && dif23<=dif12)){
            sad();
        }
    
    }

    public static void happy(){
        System.out.println(":)");
    }

    public static void sad(){
        System.out.println(":(");
    }

}