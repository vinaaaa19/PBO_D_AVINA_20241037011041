import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek admin dan mahasiswa dengan data yang benar
        Admin adminObj = new Admin("Avina", "191205", "Pinaa", "040221");
        Mahasiswa mahasiswaObj = new Mahasiswa("Avina", "141");

        boolean running = true;
        while (running) {
            System.out.println("\nPilihan Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            if (pilihan == 1) {
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scanner.nextLine();

                if (adminObj.login(username, password)) {
                    adminObj.displayInfo();
                } else {
                    System.out.println("Login Admin Gagal! Username atau Password Salah.");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswaObj.login(nama, nim)) {
                    mahasiswaObj.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa Gagal! Nama atau NIM Salah.");
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan sistem.");
                running = false;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
