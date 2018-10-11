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
public class Pertemuan0401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Menghitung Persegi");
        Persegi objPersegi = new Persegi();
        objPersegi.setSisi(10);
        System.out.println("Panjang sisi\t: " +objPersegi.getSisi());
        System.out.println("Luas\t\t: " +objPersegi.hitungLuas());
        System.out.println("Keliling\t: " +objPersegi.hitungKeliling());
        
        System.out.println();
        System.out.println("Menghitung Persegi Panjang");
        PPanjang objPPan = new PPanjang();
        objPPan.setPanjang(2);
        objPPan.setLebar(5);
        System.out.println("Panjang\t\t: " +objPPan.getPanjang());
        System.out.println("Lebar\t\t: " +objPPan.getLebar());
        System.out.println("Luas\t\t: " +objPPan.hitungLuas());
        System.out.println("Keliling\t: " +objPPan.hitungKeliling());
    
    }
    
}
