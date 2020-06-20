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
public class kotak extends bangundatar implements rumuskeliling{
    private double s;

    public kotak(double s, String nama) {
        super(nama);
        this.s = s;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
     

    @Override
    public void kelilingbangundatar() {
     System.out.println("keliling kotak: "+ (4*this.s));
    }

    @Override
    public String toString() {
        return "kotak{" +super.toString()+ "s=" + s + '}';
    }
    
    
    
}
