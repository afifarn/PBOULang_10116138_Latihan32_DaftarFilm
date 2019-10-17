/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOULang_10116138_Latihan32_DaftarFilm;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Daftar Film
 * Running
 */
public class film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying (String parName, String parGenre, double parRating, int parDuration){
    
        System.out.println("Judul Film : "+parName);
        System.out.println("Genre Film : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+ " Menit ");
        System.out.println("\n");
    }
    
}
