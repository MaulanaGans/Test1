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
public class PersegiOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s,luas,keliling;
        
        System.out.println("Sisi:");
        s = new Scanner (System.in).nextDouble(); // variabel double harus next double
        luas = s*s ;  //rumus
        keliling = s*4;
        
        System.out.println("==================Hasil Perhitungan=============");
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling Persegi: "  + keliling);
    }
    
}
