/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1018;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianan
 */
public class Main {

    public static void main(String[] args) throws IOException{
        
        Scanner scan = new Scanner(System.in);
        int N = 0;
        N = scan.nextInt();
        
        System.out.println(N);
        System.out.println((int)(N/100.00f)+" nota(s) de R$ 100,00\n"+(int)((N%100.00f)/50.00f)+" nota(s) de R$ 50,00\n"+
                (int)(((N%100.00f)%50.00f)/20.00f)+" nota(s) de R$ 20,00\n"+
                (int)((((N%100.00f)%50.00f)%20.00f)/10.00f)+" nota(s) de R$ 10,00\n"+
                (int)(((((N%100.00f)%50.00f)%20.00f)%10.00f)/5.00f)+" nota(s) de R$ 5,00\n"+
                (int)((((((N%100.00f)%50.00f)%20.00f)%10.00f)%5.00f)/2.00f)+" nota(s) de R$ 2,00\n"+
                (int)(((((((N%100.00f)%50.00f)%20.00f)%10.00f)%5.00f)%2.00f)/1.00f)+" nota(s) de R$ 1,00");
        
    }
    
}
