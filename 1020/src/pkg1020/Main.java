/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1020;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianan
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        int entrada = 0;
        entrada = scan.nextInt();
        
        System.out.println(entrada/365+" ano(s)\n"+(entrada%365)/30+" mes(es)\n"+(entrada%365)%30+" dia(s)");
        
    }
    
}
