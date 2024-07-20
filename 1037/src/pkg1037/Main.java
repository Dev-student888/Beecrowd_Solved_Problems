/**
 * 
 */
package pkg1037;

import java.io.IOException;
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
		Scanner ler = new Scanner(System.in);
		Double valor = ler.nextDouble();
		
		if(valor >= 0.00 && valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if(valor > 25.00 && valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if(valor > 50.00 && valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if(valor > 75.00 && valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		ler.close();
	}

}
