/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HONDA");
        
        Honda h = new Honda();
        h.tampilkan();
        
        System.out.println("YAMAHA");
        
        Yamaha t = new Yamaha();
        t.tampilkan();
    }
    
}
