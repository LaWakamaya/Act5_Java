/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act5java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Franco
 */
public class Act5Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int x = 0;
        int y = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese el valor de X");
        x = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el valor de Y");
        y = Integer.parseInt(br.readLine());
        
        System.out.println("Valor de X: " + x);
        System.out.println("Valor de Y: " + y);
        System.out.println("Suma: " + (x+y));
        System.out.println("Resta: " + (x-y));
        System.out.println("Multiplicacion: " + (x*y));
        System.out.println("Division: " + (x/y));
        System.out.println("Modulo: " + (x%y));
    }
    
}
