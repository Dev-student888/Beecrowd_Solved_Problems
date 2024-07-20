/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1021;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianan
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        float N;
        N = Float.parseFloat(scan.nextLine());
        
        System.out.println("NOTAS:");
        System.out.println((int)(N/100)+" nota(s) de R$ 100.00\n"+(int)((N%100)/50)+" nota(s) de R$ 50.00\n"+
                (int)(((N%100)%50)/20)+" nota(s) de R$ 20.00\n"+(int)((((N%100)%50)%20)/10)+" nota(s) de R$ 10.00\n"+
                (int)(((((N%100)%50)%20)%10)/5)+" nota(s) de R$ 5.00\n"+
                (int)((((((N%100)%50)%20)%10)%5)/2)+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.printf((int)(((((((N%100)%50)%20)%10)%5)%2)/1)+" moeda(s) de R$ 1.00\n"+
                (int)((((((((N%100)%50)%20)%10)%5)%2)%1)/0.5)+" moeda(s) de R$ 0.50\n"+
                        (int)(((((((((N%100)%50)%20)%10)%5)%2)%1)%0.5)/0.25)+" moeda(s) de R$ 0.25\n"+
                (int)((((((((((N%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)/0.10)+" moeda(s) de R$ 0.10\n"+
                        (int)(((((((((((N%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)%0.10)/0.05)+" moeda(s) de R$ 0.05\n"+
                                "%1d moeda(s) de R$ 0.01\n", (int)((((((((((((N%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)%0.10)%0.05)/0.01));
    }
    
}
