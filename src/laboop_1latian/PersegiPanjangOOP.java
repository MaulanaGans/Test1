/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop_1latian;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjangOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p,l,luas,keliling;
        
        System.out.println("Panjang:");
        p = new Scanner (System.in).nextDouble(); // variabel double harus next double
        System.out.println("luas");
        l = new Scanner (System.in).nextDouble();
        luas = p*l ;  //rumus
        keliling = 2+p*l;
        
        DecimalFormat df = new DecimalFormat(".##");//angka dibelakang koma
        System.out.println("==================Hasil Perhitungan=============");
        System.out.println("Luas Persegi Panjang: " + df.format(luas));
        System.out.println("Keliling Persegi Panjang:" + df.format(keliling));
    }
    
}
