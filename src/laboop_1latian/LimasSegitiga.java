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
public class LimasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double ls,tinggi,volume;//LuasSegitiga
        
        System.out.println("Luas Segitiga: ");
        ls = new Scanner (System.in).nextDouble();
        System.out.println("Tinggi");
        tinggi = new Scanner (System.in).nextDouble();
        volume = (ls*tinggi)/3;
        
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("------Hasil Perhitungan--------");
        System.out.println("volume Limas: "+ df.format(volume));
        
    }
    
}
