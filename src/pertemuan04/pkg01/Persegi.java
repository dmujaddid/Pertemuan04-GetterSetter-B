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
public class Persegi {
    
    private double sisi;
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double hitungLuas() {
        return sisi*sisi;
    }
    
    public double hitungKeliling() {
        return sisi*4;
    }
}
