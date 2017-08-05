/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Scanner;

/**
 *
 * @author Lopez Avila
 */
public class Problem2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        y = sc.nextInt();
        System.out.println("Ingrese el tercer número");
        z = sc.nextInt();
        
        Problem2 sum = new Problem2();
        System.out.println("El resultado de la suma de los tres números es: " + sum.suma(x, y, z));
    }
    
    public int suma(int x, int y, int z){
        return x + y + z;
    }
}
