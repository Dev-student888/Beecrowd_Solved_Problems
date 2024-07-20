/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1035;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ianan
 */
public class Main {

    public static void main(String[] args) throws IOException{
        
		Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        String line = ler.nextLine();
        
        for(int i = 0; i < Arrays.asList(line.split(" ")).size(); i++) {
        	lista.add(Integer.parseInt(Arrays.asList(line.split(" ")).get(i)));
        }
        
        int A = lista.get(0);
        int B = lista.get(1);
        int C = lista.get(2);
        int D = lista.get(3);
        
        if(B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && (A%2) == 0) {
        	System.out.println("Valores aceitos");
        } else {
        	System.out.println("Valores nao aceitos");
        }
        
    }
    
}
