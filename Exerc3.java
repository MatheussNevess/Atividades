package JavaBasico;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario,add,horas,desc,liquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com seu salário: ");
		salario = leia.nextFloat();
		System.out.println("\nEntre com seu adicional noturno: ");
		add = leia.nextFloat();
		System.out.println("\nEntre com suas horas extras: ");
		horas = leia.nextFloat();
		System.out.println("\nEntre com seu desconto: ");
		desc = leia.nextFloat();
		
		liquido = (salario + add + (horas * 5 ) - desc);
		
		System.out.printf("\nSeu salário liquido é de: %.2f", liquido);
		
	}

}
