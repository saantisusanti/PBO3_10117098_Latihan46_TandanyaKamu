/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan46_tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Mengetahui tanda pada diri Anda sesuai dengan tahun
 *                     lahir Anda
 */
public class PBO3_10117098_Latihan46_TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Age age = new Age(2018);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn1.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir Anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun   : "+age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah : "+age.hitungUmur
        ()+" tahun");
        System.out.println("Tandanya kamu    : "+age.tandanyaKamu
        (age.hitungUmur()));
    }
    
}
