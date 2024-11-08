public class MainClass {
    public static void main(String[] args) {
        // Membuat objek Pelajar1
        Pelajar pelajar1 = new Pelajar("Surya", 19, "Halim Perdana Kusuma");
        
        // Membuat objek Tabungan untuk pelajar1
        TabunganMahasiswa tabungan1 = new TabunganMahasiswa("041204", pelajar1, 500000, "Universitas Negeri Semarang", "Pendidikan Teknik Informatika dan Komputer");

        // Menabung dan mengecek saldo
        tabungan1.menabung(500000);
        System.out.println("Saldo Tabungan 1: " + tabungan1.cekSaldo());

        // Transfer uang dengan biaya administrasi
        tabungan1.transfer(tabungan1, 10000);
        System.out.println("Saldo Tabungan Mahasiswa setelah transfer: " + tabungan1.cekSaldo());

        // Menampilkan informasi tabungan
        tabungan1.printInfoTabungan();
    }
}
