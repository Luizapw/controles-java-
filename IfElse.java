package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(
				"Infome um numero; ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Numero par!");
		} else {
			System.out.println("Numero impar!");	
		}		
	}
	    //N�O USAR (;) PONTO E VIRGULA, EM ESTRUTURAS DE CONTROLE.
	    // (%) M�DULO - RESTO DA DIVIS�O.
}