/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * Deskripsi Program : User nilai diameter lingkaran, menampilkan panjang jari-
 *                     jari lingkaran, luas lingkaran dan keliling lingkara.
 * 
 */
public class PBO310117122Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int diameter = 0;
        double luas, jari, keliling, phi;
        
        do { 
            System.out.print("Masukkan Nilai Diameter : ");
            try {
                diameter = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Nilai Diameter tidak Sesuai");
                scan.nextLine();
            }
        } while (diameter < 10);
        
        phi      = 3.14;
        jari     = diameter/2;
        luas     = phi * jari * jari;
        keliling = 2 * phi * jari;
        
        System.out.println();
        System.out.println("===Hasil Perhitungan Lingkaran===");
        System.out.println("Jari-jari Lingkaran = " + jari);
        System.out.println("Luas Lingkaran      = " + luas);
        System.out.println("Keliling Lingkaran  = " + keliling);
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
