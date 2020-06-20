/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop_1latian;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class KubusOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s,volume;
        
        System.out.println("Sisi:");
        s = new Scanner (System.in).nextDouble();
        volume = s*s*s;
        
        System.out.println("---Hasil Perhitungan---");
        System.out.println("volume kubus: " + volume);
    }
    
}
