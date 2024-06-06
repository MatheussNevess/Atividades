package JavaBasico;

import java.util.Scanner;

public class ExercicioIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String carac1, carac2, carac3;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite a primeira característica: ");
		carac1 = leia.nextLine();
		System.out.println("\nDigite a segunda característica: ");
		carac2 = leia.nextLine();
		System.out.println("\nDigite a terceira característica: ");
		carac3 = leia.nextLine();

		if (carac1.equalsIgnoreCase("Vertebrado")) {
			if (carac2.equalsIgnoreCase("Ave")) {
				if (carac3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("\nÉ uma Águia.");
				} else {
					System.out.println("\nÉ uma Pomba.");
				}
			}
			if (carac2.equalsIgnoreCase("Mamífero")) {
				if (carac3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nÉ um Homem.");
				} else {
					System.out.println("\nÉ uma Vaca.");
				}
			}
		} else {
			if (carac2.equalsIgnoreCase("Inseto")) {
				if (carac3.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nÉ uma Pulga.");
				} else {
					System.out.println("\nÉ uma Lagarta.");
				}
			} else {
				if (carac3.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nÉ um Sanguessuga.");
				} else {
					System.out.println("\nÉ uma Minhoca.");
				}
			}
		}
	}

}
