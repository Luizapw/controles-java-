package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do { 
			System.out.println("Voc� precisa falar "
					+"\n as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto =  entrada.nextLine();
		} while(!texto.equalsIgnoreCase ("Por Favor"));
		
		System.out.println("Obrigada");
		entrada.close();
	}
}