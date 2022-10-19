package Beecrowd_Java;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bee_2758 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("");

        float A, B;
        double C, D;

        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextDouble();
        D = input.nextDouble();
        
        df = new DecimalFormat("0.000000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.00");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000E00");
		if (!df.format(A).contains("E-"))
			System.out.print("A = " + df.format(A).replace("E", "E+"));
		else
			System.out.print("A = " + df.format(A));
		if (!df.format(B).contains("E-"))
			System.out.println(", B = " + df.format(B).replace("E", "E+"));
		else
			System.out.println(", B = " + df.format(B));

		if (!df.format(C).contains("E-"))
			System.out.print("C = " + df.format(C).replace("E", "E+"));
		else
			System.out.print("C = " + df.format(C));
		if (!df.format(D).contains("E-"))
			System.out.println(", D = " + df.format(D).replace("E", "E+"));
		else
			System.out.println(", D = " + df.format(D));

		df = new DecimalFormat("0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));
    }
}
