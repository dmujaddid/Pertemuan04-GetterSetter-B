/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan04.pkg01;

/**
 *
 * @author eka
 */
public class PPanjang {
    
    private double panjang;
    private double lebar;
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return (panjang+lebar)*2;
    }
    
    public double hitungLuas() {
        return panjang*lebar;
    }
    
}
