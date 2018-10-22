/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan47nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan nilai indeks mahasiswa
 */
public class PBO310117119Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        NilaiMahasiswa objI = new NilaiMahasiswa();

        System.out.print("QUIZ                      = ");
        objI.setQuis(scan1.nextDouble());
        System.out.print("UTS                       = ");
        objI.setUts(scan2.nextDouble());
        System.out.print("UAS                       = ");
        objI.setUas(scan3.nextDouble());

        System.out.println("");
        System.out.println("Nilai Akhir = " + objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");

    }

}
