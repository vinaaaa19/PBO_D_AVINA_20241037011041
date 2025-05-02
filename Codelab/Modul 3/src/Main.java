//kelas dasar karakter game
class karakter_game{
    private final String nama;
    private int kesehatan;

    //constructor karakter game
    public karakter_game(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //get untuk kesehatan
    public int getKesehatan(){
        return kesehatan;
    }

    //set untuk memperbarui kesehatan
    public void setKesehatan(int kesehatan_baru){
        this.kesehatan = kesehatan_baru;
    }

    //get untuk nama
    public String getNama(){
        return nama;
    }
}

//kelas musuh anak dari kelas karakter game
class Musuh extends karakter_game{
    public Musuh (String nama, int kesehatan){
        super(nama, kesehatan);
    }
    //deklarasi metode penyerangan musuh
    public void  serang(karakter_game target){
        System.out.println(getNama() + "menyerang " + target.getNama() + "menggunakan Snake Bite!!");
        target.setKesehatan(target.getKesehatan() -15);
        System.out.println(target.getNama() + "sekarang " + "memiliki kesehatan: " + target.getKesehatan());
    }
}

//kelas pahlawan anak dari kelas karakter game
class Pahlawan extends karakter_game{
    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }
    //deklarasi metode penyerangan pahlawan
    public void serang (karakter_game target){
        System.out.println(getNama() + "menyerang " + target.getNama() + "menggunakan Orbital Strike!!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + "sekarang " + "memiliki kesehatan: " + target.getKesehatan());
    }
}

//kelas utama (main class)
public class Main {
    public static void main (String[] args) {
        //membuat objek karakter pahlawan atau musuh
        Pahlawan Brimstone = new Pahlawan("Brimstone ",250);
        Musuh Viper = new Musuh("Viper ",200);

        //menampilkan hitungan kesehatan awal karakter
        System.out.println("Status awal yang dimiliki karakter");
        System.out.println(Brimstone.getNama() + " :"  + Brimstone.getKesehatan());
        System.out.println(Viper.getNama() + " :" + Viper.getKesehatan());
        System.out.println();


        //Karakter pahlawan menyerang musuh
        Brimstone.serang(Viper);
        //karakter musuh menyerang pahlawan
        Viper.serang(Brimstone);
    }
}