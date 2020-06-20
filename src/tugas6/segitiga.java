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
public class segitiga extends bangundatar implements rumuskeliling{
    private double a;
    private double t;

    public segitiga(double a, double t, String nama) {
        super(nama);
        this.a = a;
        this.t = t;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "segitiga{" +super.toString()+ "a=" + a + ", t=" + t + '}';
    }

    
    @Override
    public void kelilingbangundatar() {
       System.out.println("keliling segitiga: "+ (this.a* this.t/2));
    }
    
 
           
    
}
