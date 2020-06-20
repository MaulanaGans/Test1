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
public class Yamaha extends Motor {     
    public void tampilkan(){
        String bahanbakar;
        
        bahanbakar="Premium";
        
        Motor m = new Motor();
        
        m.inputData("Mio","Matic","Putih");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar :"+bahanbakar);
    }  
}
