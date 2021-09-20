/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;

/**
 *
 * @author -LENOVO-
 */
public class Anggota {
    private int limitPinjam, jmlPinjam,min;
    private String noKTP, nama;
    
    Anggota(String noKTP, String nama, int limitPinjam){
        this.noKTP=noKTP;
        this.nama=nama;
        this.limitPinjam=limitPinjam;
    }
    protected String getNama(){
        return nama;
    }
    protected int getLimitPinjam(){
        return limitPinjam;
    }
    protected void angsur(int angsur){          
            min=(int)(jmlPinjam*0.1);
            if (angsur<min) {
                System.out.println("Maaf, jumlah angsuran minimal 10% dari pinjaman");
            } else {
                jmlPinjam-=angsur;
            }
    }
    protected void pinjam(int pinjam){
        if (pinjam>limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jmlPinjam=pinjam;
        }
    }
    protected int getJumlahPinjaman(){
        return jmlPinjam;
    }
}
