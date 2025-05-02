import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta pengguna memasukkan jenis kelamin (P/L)
        char jenisKelamin = ' ';
        while (true) {
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = scanner.next().charAt(0);
            if (jenisKelamin == 'P' || jenisKelamin == 'p' || jenisKelamin == 'L' || jenisKelamin == 'l') {
                break; // keluar dari loop jika input valid
            } else {
                System.out.println("Input tidak valid. Harap masukkan 'P' untuk Perempuan atau 'L' untuk Laki-laki.");
            }
        }

        // Meminta pengguna memasukkan tahun lahir dengan pengecekan
        int tahunLahir = 0;
        while (true) {
            System.out.print("Masukkan tahun lahir: ");
            if (scanner.hasNextInt()) {
                tahunLahir = scanner.nextInt();
                int tahunSekarang = LocalDate.now().getYear();
                if (tahunLahir <= tahunSekarang && tahunLahir > 1900) {
                    break; // keluar dari loop jika tahun lahir valid
                } else {
                    System.out.println("Tahun lahir tidak valid. Harap masukkan tahun yang sesuai.");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan tahun dalam format angka.");
                scanner.next(); // untuk membuang input yang tidak valid
            }
        }

        // Menentukan jenis kelamin dalam bentuk teks
        String jenisKelaminTeks = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" : "Perempuan";

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan output sesuai format yang diminta
        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelaminTeks);
        System.out.println("Umur            : " + umur + " tahun");

        // Menutup Scanner setelah selesai membaca input
        scanner.close();
    }
}
