package JavaBasico;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, num, par = 0, impar = 0;

		Scanner leia = new Scanner(System.in);
		
		for (x = 1; x <= 10; x++) {
			System.out.println("\nEntre com um número inteiro: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("\nTotal dde números pares: " + par);
		System.out.println("\nTotal dde números ímpares: " + impar);
	}

}
