package JavaBasico;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, multiplo = 0, total = 0;
		double media;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número inteiro: ");
			num = leia.nextInt();

			if (num % 3 == 0 && num != 0) {
				multiplo += num;
				total++;
			}

		} while (num != 0);
		media = (double) multiplo / total;

		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", media);
	}
}
