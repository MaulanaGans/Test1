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
public class Ayah  {
    private  String nama;
    private  String tgllahir;
    private  String pekerjaan;

public Ayah() {
    
        }

    public Ayah(String nama, String tgllahir, String pekerjaan) {
        this.nama = nama;
        this.tgllahir = tgllahir;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @Override
    public String toString() {
        return "Ayah{" + "nama=" + nama + ", tgllahir=" + tgllahir + ", pekerjaan=" + pekerjaan + '}';
    }
    
    
   
    
    
    
}
