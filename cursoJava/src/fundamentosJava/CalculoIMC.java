package fundamentosJava;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso/ (altura *altura);
		
		System.out.print("IMC de "+ nome + ": "+ imc);
		
	
	}

}
