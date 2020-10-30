/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan26.waktusaatini;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program Waktu Saat Ini
 **/
import java.util.Date;
import java.text.SimpleDateFormat;
public class PBOIF210119084Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("E dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini :"+ format.format(tanggal));
        
        System.out.println("==================================================");
        System.out.println("Developed by Muhammad Idris Merdefi");
    }
    
}
