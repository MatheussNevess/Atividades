package JavaBasico;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numBackend = 0, numMulheresFrontend = 0, numHomensMobile = 0, numBinariosFull = 0, total = 0,
				somaIdades = 0, idade, genero, dev, mediaIdade;
		String continuar="S";

		Scanner leia = new Scanner(System.in);

		while (continuar.equalsIgnoreCase("S")) {

			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();

			System.out.println("\nIdentidade de genêro: ");
			System.out.println(" 1- Mulher Cis ");
			System.out.println(" 2- Homem Cis ");
			System.out.println(" 3- Não Binário ");
			System.out.println(" 4- Mulher Trans ");
			System.out.println(" 5- Homem Trans  ");
			System.out.println(" 5- Outras  ");
			System.out.println("\nDigite o número correspondete: ");
			genero = leia.nextInt();

			System.out.println("\nPessoa Desenvolvedora: ");
			System.out.println(" 1- Backend ");
			System.out.println(" 2- Frontend ");
			System.out.println(" 3- Mobile ");
			System.out.println(" 4- Fullstack ");
			System.out.println("\nDigite o número correspondete: ");
			dev = leia.nextInt();

			total++;
			somaIdades += idade;

			if (dev == 1) {
				numBackend++;
			} else if (dev == 2) {
				if (genero == 1 || genero == 4) {
					numMulheresFrontend++;
				}
			} else if (dev == 3) {
				if (genero == 2 || genero == 5 && idade >= 40) {
					numHomensMobile++;
				}
			} else if (dev == 4) {
				if (genero == 3 && idade <= 30) {
					numBinariosFull++;
				}
			}
			leia.nextLine();
			System.out.println("\nDeseja continuar com a leitura de dados de um novo colaborador: (S) ou (N)");
			continuar = leia.nextLine();
		}
		mediaIdade = somaIdades / total;

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + numBackend);
		System.out.println("\nTotal de mulheres Cis e Trans desenvolvedoras Frontend: " + numMulheresFrontend);
		System.out.println("\nTotal de homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + numHomensMobile);
		System.out
				.println("\nTotal de pessoas não binárias desenvolvedoras FullStack menores de 30 anos: " + numBinariosFull);
		System.out.println("\nNúmero total de pessoas que responderam a pesquisa: " + total);
		System.out.println("\nA média de idade das pessoas que responderam a pesquisa é de: " + mediaIdade);
	}
}
