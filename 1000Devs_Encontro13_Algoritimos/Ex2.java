// 2. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um
// funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse
// funcionário

import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    
    public static void Ex2(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        float salarioMinimo, salarioFunc;

        System.out.print("Informe o valor do salario minimo: ");
        salarioMinimo = input.nextFloat();
        System.out.print("Informe o valor do salario do funcionario: ");
        salarioFunc = input.nextFloat();

        System.out.printf("O funcionario recebe %.1f salarios minimos", salarioFunc/salarioMinimo);
        

    }
    
}
