package JavaBasico;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com um número inteiro: ");
		num = leia.nextInt();

		do {
			if(num >= 0) {
				soma += num;
			}
			System.out.println("\nEntre com um número inteiro: ");
			num = leia.nextInt();

		} while(num != 0);
		
		System.out.println("\nA soma dos números positivos foi de: "+soma);
	}

}
