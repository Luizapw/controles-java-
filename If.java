package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double m�dia = entrada.nextDouble();
		
		if (m�dia < 10 && m�dia > 7.0) { //CONDICIONAL
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(m�dia < 7 && m�dia > 4.5) 
			System.out.println("Recupera��o");
		
		
		if(m�dia < 4.5 && m�dia > 0) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
