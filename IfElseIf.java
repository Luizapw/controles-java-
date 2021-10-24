package controle;

import java.util.Scanner;
public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inv�lida!");
		} else if (nota > 8.1) {
			System.out.println("Conceito A");
			System.out.println("Parab�ns!");
		} else if (nota > 6.1) {
			System.out.println("Conceito B");
			System.out.println("Voc� est� na m�dia!");
		} else if (nota > 4.1) {
			System.out.println("Conceito C");
			System.out.println("Estude um pouco mais!");
		} else if (nota > 2.1) {
			System.out.println("Conceito D");
			System.out.println("N�o desista!");
		} else {
			System.out.println("Conceito E");
			System.out.println("Dedica��o � tudo!");
			}
		System.out.println("Fim!");
		entrada.close();
	}
}
