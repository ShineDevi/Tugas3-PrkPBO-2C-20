/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;
import java.util.Scanner;
/**
 *
 * @author -LENOVO-
 */
public class TestKoperasi {
    public static void main(String[] args) {
        String ktp, nm;
        int limit, pjm, angsur;
        Scanner shine=new Scanner(System.in); 
        System.out.print("Masukkan Nomor KTP       : ");
        ktp=shine.next();
        shine.nextLine();
        System.out.print("Masukkan Nama            : ");
        nm=shine.next();
        shine.nextLine();
        System.out.print("Masukkan Limit pinjaman  : ");
        limit=shine.nextInt();
        Anggota donny=new Anggota(ktp, nm, limit);
        do {            
            System.out.println("\nMeminjam uang...");
            System.out.print("Masukkan jumlah uang: ");
            pjm=shine.nextInt();
            donny.pinjam(pjm);
            System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
        } while (pjm>limit);
        System.out.println("\nMembayar angsuran");
        System.out.print("Masukkan jumlah uang: ");
        angsur=shine.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
    }
}
