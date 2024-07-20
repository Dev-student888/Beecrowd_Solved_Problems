/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1019;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianan
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int N;
        N = scan.nextInt();
        
        System.out.println(N/3600+":"+(N%3600)/60+":"+N%60);
        
    }
    
}
 