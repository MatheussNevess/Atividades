package JavaBasico;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alunos, bimestre, somaTotal = 0, matriz[][] = new int[10][4];
		float mediaAnual, vetor[] = new float[10];

		Scanner leia = new Scanner(System.in);

		for (alunos = 0; alunos < 10; alunos++) {
			somaTotal = 0;
			for (bimestre = 0; bimestre < 4; bimestre++) {
				System.out.println("\nEntre com a nota do aluno " + (alunos + 1) + " no bimestre " + (bimestre + 1) + " :");
				matriz[alunos][bimestre] = leia.nextInt();
				somaTotal += matriz[alunos][bimestre];
			}
			mediaAnual = (float) somaTotal / 4;
			vetor[alunos] = mediaAnual;
		}
		for (alunos = 0; alunos < 10; alunos++) {
			System.out.println("\nA média anual do aluno " + (alunos + 1) + " foi de " + vetor[alunos] + ".");
		}
	}
}
