package JavaBasico;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor (A): ");
		a = leia.nextInt();
		System.out.println("\nEntre com um valor (B): ");
		b = leia.nextInt();
		System.out.println("\nEntre com um valor (C): ");
		c = leia.nextInt();
		
		soma = (a + b);
		
		if(soma > c) {
			System.out.printf("\n %d + %d = %d > %d",a,b,soma,c);
			System.out.printf("\nA soma de A + B é maior que C.");
		}else if (soma == c){
			System.out.printf("\n %d + %d = %d = %d",a,b,soma,c);
			System.out.printf("\nA soma de A + B é igual a C.");
		}else {
			System.out.printf("\n %d + %d = %d < %d",a,b,soma,c);
			System.out.printf("\nA soma de A + B é menor que C.");
		}
	}

}
