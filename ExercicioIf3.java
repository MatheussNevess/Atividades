package JavaBasico;

import java.util.Scanner;

public class ExercicioIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		String nome;
		boolean doacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nÉ a primeira doação de sangue? (true/false): ");
		doacao = leia.nextBoolean();

		if (idade >= 18 && idade < 60) {
			System.out.printf("\n%s está apto para doar sangue.", nome);
		} else if (idade >= 60 && idade < 70 && doacao == false) {
			System.out.printf("\n%s está apto para doar sangue.", nome);
		} else if (idade >= 60 && idade < 70 && doacao == true) {
			System.out.printf("\n%s está não está apto para doar sangue.", nome);
		} else {
			System.out.printf("\n%s está não está apto para doar sangue.", nome);
		}

	}

}
