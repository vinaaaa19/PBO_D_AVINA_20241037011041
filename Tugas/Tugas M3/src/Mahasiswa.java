class Mahasiswa extends User{
    public Mahasiswa(String nama, String nim) {

        super(nama, nim);
    }

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(getNama()) && inputNim.equals(getNim());
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Anda Berhasil!!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}
