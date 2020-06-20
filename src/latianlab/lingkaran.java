/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianlab;

/**
 *
 * @author Lenovo
 */
public class lingkaran extends rumus implements phi {
   public double r;

    public lingkaran() {
    }

    public lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "lingkaran{" + "r=" + r + '}';
    }
    
   
   double keliling(){
       return 2*phi*r;
   }
}
