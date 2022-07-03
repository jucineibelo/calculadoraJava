package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);

		int num = 0;

		while (num != 5) {
			System.out.println("CALCULADORA DO JUCI");
			System.out.println("-------------------------------------");
			System.out.println("Escolha uma opção para calcular: ");
			System.out.println("1 para somar: ");
			System.out.println("2 para diminuir: ");
			System.out.println("3 para multiplicar: ");
			System.out.println("4 para dividir: ");
			System.out.println("5 para encerrar: ");
			System.out.println("-------------------------------------\n");
			int opcao = calc.nextInt();

			if (opcao == 1) {
				System.out.println("Insira o primeiro número: ");
				int n1 = calc.nextInt();
				System.out.println("Insira o segundo número: ");
				int n2 = calc.nextInt();
				double resultado = n1 + n2;
				System.out.println("O resultado da soma é: " + resultado);
				
			} else if (opcao == 2) {
				System.out.println("Insira o primeiro número: ");
				int n1 = calc.nextInt();
				System.out.println("Insira o segundo número: ");
				int n2 = calc.nextInt();
				double resultado = n1 - n2;
				System.out.println("O resultado da subtração é: " + resultado);
				
			} else if (opcao == 3) {
				System.out.println("Insira o primeiro número: ");
				int n1 = calc.nextInt();
				System.out.println("Insira o segundo número: ");
				int n2 = calc.nextInt();
				double resultado = n1 * n2;
				System.out.println("O resultado da multiplicação é: " + resultado);
				
			} else if (opcao == 4) {
				System.out.println("Insira o primeiro número: ");
				int n1 = calc.nextInt();
				System.out.println("Insira o segundo número: ");
				int n2 = calc.nextInt();
				double resultado = n1 * n2;
				System.out.println("O resultado da divisão é: " + resultado);
				
			} else if (opcao == 5) {
				System.out.println("Calculadora finalizada....");
				break;
				
			} else {
				System.out.println("Opção Invalida!");
				System.out.println("Por favor escolha uma opção: \n");
			}
			
			System.out.println("");
		}
	}
}
