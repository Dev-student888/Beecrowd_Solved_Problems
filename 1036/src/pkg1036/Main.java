package pkg1036;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		String linha = ler.nextLine();
		ArrayList<Double> lista = new ArrayList<Double>();
		
		for(int i = 0; i < Arrays.asList(linha.split(" ")).size(); i++) {
			lista.add( Double.parseDouble( Arrays.asList(linha.split(" ")).get(i) ) );
		}
		
		Double A = lista.get(0); 
		Double B = lista.get(1);
		Double C = lista.get(2);
		
		Double delta = ((B*B)-(4*A*C));
		Double R1 = ((-B + Math.sqrt(delta))/(2*A));
		Double R2 = ((-B - Math.sqrt(delta))/(2*A));
		
		
		if((A <= 0) || (B <= 0) || (C <= 0)) {
			System.out.println("Impossivel calcular");
		} else if(delta > 0) {
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		} else if (delta == 0) {
			System.out.printf("R1 = %.5f\n", R1);
		} else {
			System.out.println("Impossivel calcular");
		}
		
		ler.close();
	}
}
