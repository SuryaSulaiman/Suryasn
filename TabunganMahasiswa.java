public class TabunganMahasiswa extends Tabungan {
    private String Universitas;
    private String Jurusan;
    private static final double BIAYA_ADMINISTRASI = 10000;

    public TabunganMahasiswa(String noRekening, Pelajar pelajar, double Saldo, String Universitas, String Jurusan) {
        super(noRekening, pelajar, Saldo);
        this.Universitas = Universitas;
        this.Jurusan = Jurusan;
    }

    @Override
    public double transfer(Tabungan TabunganTujuan, double jumlahUang) {
        double totalTransfer = jumlahUang + BIAYA_ADMINISTRASI;
        if (cekSaldo() >= totalTransfer) {
            super.menarikTabungan(totalTransfer);
            TabunganTujuan.menabung(jumlahUang);
            System.out.println("Transfer berhasil, biaya administrasi: Rp " + BIAYA_ADMINISTRASI);
            return cekSaldo();
        } 
        else {
            System.out.println("Saldo tidak cukup untuk transfer.");
            return cekSaldo();
        }
    }

    @Override
    public void printInfoTabungan() {
        super.printInfoTabungan();
        System.out.println("Universitas: " + this.Universitas);
        System.out.println("Jurusan: " + this.Jurusan);
    }   
}
