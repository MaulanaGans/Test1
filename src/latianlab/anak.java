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
public class anak extends Ayah{
    private String sekolah;

    public anak(String sekolah) {
        this.sekolah = sekolah;
    }

    public anak(String sekolah, String nama, String tgllahir, String pekerjaan) {
        super(nama, tgllahir, pekerjaan);
        this.sekolah = sekolah;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    @Override
    public String toString() {
        return "anak{" + super.toString()+ "sekolah=" + sekolah + '}';
    }
    
    
    
}
