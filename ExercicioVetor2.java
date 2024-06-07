package JavaBasico;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, somaVetor = 0, impar, par, vetor[] = new int[10];
		float mediaVetor;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 10; x++) {
			System.out.println("\nEntre com um múmero inteiro: ");
			vetor[x] = leia.nextInt();
			somaVetor += vetor[x];
		}
		mediaVetor = somaVetor / x - 1;
		System.out.println("\nElementos nos indices ímpares: "+vetor[1]+" "+vetor[3]+" "+vetor[5]+" "+vetor[7]+" "+vetor[9]);
		System.out.println("\nElementos nos indices pares: "+vetor[0]+" "+vetor[2]+" "+vetor[4]+" "+vetor[6]+" "+vetor[8]);
		System.out.println("\nSoma dos elementos: "+ somaVetor);
		System.out.println("\nMédia dos elementos: "+ mediaVetor);
	}
}

