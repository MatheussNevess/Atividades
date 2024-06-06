package JavaBasico;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,menor=0,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade:");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			if(idade <= 21) {
				menor++;
			}else if(idade >= 50) {
				maior++;
			}
			System.out.println("\nEntre com sua idade");
			idade = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maior);
	}

}
