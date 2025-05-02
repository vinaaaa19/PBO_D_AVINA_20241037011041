package App;

import Perpustakaan.Anggota;
import Perpustakaan.Buku;
import Perpustakaan.Fiksi;
import Perpustakaan.Nonfiksi;

public class Main {
    public static void main(String[] args) {
        // Buku
        Buku b1 = new Nonfiksi("Grammer for speaking", "Mr. Raditya", "Bahasa IN=b=nggris");
        Buku b2 = new Fiksi("Keajaiban toko kelontong Namiya", "Keigo Hirashino", "Dongeng");

        b1.displayInfo();
        b2.displayInfo();

        System.out.println();

        // Anggota
        Anggota a1 = new Anggota("Avina", "D141");
        Anggota a2 = new Anggota("Rudi", "D136");
        Anggota a3 = new Anggota("Sopi", "D126");

        a1.displayInfo();
        a2.displayInfo();
        a3.displayInfo();

        System.out.println();

        // Peminjaman
        a1.pinjamBuku("Grammer for speaking");
        a2.pinjamBuku("Keajaiban toko kelontong Namiya", 7);

        System.out.println();

        // Pengembalian
        a1.kembalikanBuku("Grammer for speaking");
        a2.kembalikanBuku("Keajaiban toko kelontong Namiya");
    }
}

