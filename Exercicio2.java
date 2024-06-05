package JavaBasico;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,n4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3+ n4) / 4;
		
		System.out.printf("\nA média é: %.2f", media);
	}

}
