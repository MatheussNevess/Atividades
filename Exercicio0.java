package JavaBasico;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,abono,novo;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com seu salario: ");
        salario = leia.nextFloat();
        
        System.out.println("\nEntre com o abono salarial: ");
        abono = leia.nextFloat();
     
        novo = (salario + abono);
        
        System.out.printf("\nSeu novo salário é: %.2f", novo);
		
	}


}


