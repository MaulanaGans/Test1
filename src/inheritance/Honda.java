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
public class Honda extends Motor {
    public void tampilkan(){
        String bahanbakar="premium";
        
        Motor m = new Motor();
        
        m.inputData("Blade","Bebek","hitam");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar :"+bahanbakar);
    }
    
}
