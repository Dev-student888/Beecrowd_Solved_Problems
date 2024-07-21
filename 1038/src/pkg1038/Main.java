/**
 * 
 */
package pkg1038;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{
		Locale.setDefault(new Locale("en", "US"));
		int codigoItem, qtdItem;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String entrada = input.nextLine();
		
		for(int i = 0; i < Arrays.asList(entrada.split(" ")).size(); i++) {
			lista.add( Integer.parseInt( Arrays.asList( entrada.split(" ") ).get(i) ) );
		}
		
		codigoItem = lista.get(0);
		qtdItem = lista.get(1);
		
		/*
		 * Cod 1 - Cachorro Quente - R$4,00
		 * Cod 2 - X-Salada - R$4,50
		 * Cod 3 - X-Bacon - R$5,00
		 * Cod 4 - Torrada Simples - R$2,00
		 * Cod 5 - Refrigerante - R$1,50
		 */
		
		if(codigoItem == 1) {
			System.out.printf("Total: R$ %.2f\n", (qtdItem * 4.00));
		} else if(codigoItem == 2) {
			System.out.printf("Total: R$ %.2f\n", (qtdItem * 4.50));
		} else if(codigoItem == 3) {
			System.out.printf("Total: R$ %.2f\n", (qtdItem * 5.00));
		} else if(codigoItem == 4) {
			System.out.printf("Total: R$ %.2f\n", (qtdItem * 2.00));
		} else if(codigoItem == 5) {
			System.out.printf("Total: R$ %.2f\n", (qtdItem * 1.50));
		}
		
		input.close();
	}

}
