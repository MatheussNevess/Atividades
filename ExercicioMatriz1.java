package JavaBasico;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somaDiagonalPrincipal, somaDiagonalSecundaria, linha, coluna, valores[][] = new int[3][3];

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nEntre com o valor da linha " + linha + " e o valor da coluna " + coluna + " :");
				valores[linha][coluna] = leia.nextInt();
			}
		}

		somaDiagonalPrincipal = valores[0][0] + valores[1][1] + valores[2][2];
		somaDiagonalSecundaria = valores[0][2] + valores[1][1] + valores[2][0];

		System.out.println("\nElementos da diagonal principal: " + valores[0][0] + ", " + valores[1][1] + ", " + valores[2][2]+".");
		System.out.println("\nElementos da diagonal secundária: " + valores[0][2] + ", " + valores[1][1] + ", " + valores[2][0]+".");
		System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonalPrincipal+".");
		System.out.println("\nSoma dos elementos da diagonal secundária: " + somaDiagonalSecundaria+".");

	}

}
