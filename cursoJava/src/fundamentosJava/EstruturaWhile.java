package fundamentosJava;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero inicial: ");
		int numeroInicial = entrada.nextInt();
		
		
		System.out.println("Digite o numero Final: ");
		int numeroFinal = entrada.nextInt();
		
		
		int numeroAtual = numeroInicial;
		
		while(numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}

	}

}
