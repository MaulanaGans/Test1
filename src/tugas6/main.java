/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

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
        segitiga segitiga = new segitiga(4,4,"Segitiga");
        kotak kotak = new kotak(4,"kotak");
        rumuskeliling[] mybr={segitiga,kotak};
        for(rumuskeliling BD : mybr){
            System.out.println(BD.toString());
            System.out.println("Hasil rumuskeliling");
            BD.kelilingbangundatar();
        }
        
    }
    
}
