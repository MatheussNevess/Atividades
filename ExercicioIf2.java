package JavaBasico;

import java.util.Scanner;

public class ExercicioIf2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com um número inteiro: ");
	num = leia.nextInt();
	
	if (num >= 0 && num % 2 !=0) {
		System.out.printf("\no número %d é positivo e ímpar.",num);
	}else if(num >= 0 && num % 2 ==0) {
		System.out.printf("\no número %d é positivo e par.",num);
	}else if(num < 0 && num % 2 ==0) {
		System.out.printf("\no número %d é negativo e par.",num);
	}else {
		System.out.printf("\no número %d é negativo e ímpar.",num);
	}
	
}

}