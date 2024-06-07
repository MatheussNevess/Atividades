package JavaBasico;

import java.util.Scanner;

public class ExexrcicioVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, num, vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = leia.nextInt();

		switch (num) {
		case 2:
			System.out.println("\nO número " + vetor[0] + " está localizado na posição 0.");
			break;
		case 5:
			System.out.println("\nO número " + vetor[1] + " está localizado na posição 1.");
			break;
		case 1:
			System.out.println("\nO número " + vetor[2] + " está localizado na posição 2.");
			break;
		case 3:
			System.out.println("\nO número " + vetor[3] + " está localizado na posição 3.");
			break;
		case 4:
			System.out.println("\nO número " + vetor[4] + " está localizado na posição 4.");
			break;
		case 9:
			System.out.println("\nO número " + vetor[5] + " está localizado na posição 5.");
			break;
		case 7:
			System.out.println("\nO número " + vetor[6] + " está localizado na posição 6.");
			break;
		case 8:
			System.out.println("\nO número " + vetor[7] + " está localizado na posição 7.");
			break;
		case 10:
			System.out.println("\nO número " + vetor[8] + " está localizado na posição 8.");
			break;
		case 6:
			System.out.println("\nO número " + vetor[9] + " está localizado na posição 9.");
			break;
		default:
			System.out.println("\nO número " + num + " não foi encontrado.");

		}
	}

}
