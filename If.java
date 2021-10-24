package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double média = entrada.nextDouble();
		
		if (média < 10 && média > 7.0) { //CONDICIONAL
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(média < 7 && média > 4.5) 
			System.out.println("Recuperação");
		
		
		if(média < 4.5 && média > 0) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
