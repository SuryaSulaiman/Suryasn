public class Tabungan {
    private Pelajar pelajar;
    private double Saldo;
    private String noRekening;

    public Tabungan(String noRekening, Pelajar pelajar, double Saldo) {
        this.noRekening = noRekening;
        this.pelajar = pelajar;
        this.Saldo = Saldo;
    }

    public void menabung(double jumlahUang) {
        this.Saldo += jumlahUang;
        System.out.println("Menabung: Rp " + jumlahUang);
    }

    public void menarikTabungan(double jumlahUang) {
        if (this.Saldo >= jumlahUang) {
            this.Saldo -= jumlahUang;
            System.out.println("Menarik Tabungan: Rp " + jumlahUang);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public double cekSaldo() {
        return this.Saldo;
    }

    public double transfer(Tabungan TabunganTujuan, double jumlahUang) {
        if (this.Saldo >= jumlahUang) {
            this.Saldo -= jumlahUang;
            TabunganTujuan.menabung(jumlahUang);
            return this.Saldo;
        } 
        else {
            System.out.println("Saldo tidak cukup untuk transfer.");
            return this.Saldo;
        }
    }

    public void printInfoTabungan() {
        System.out.println("No Rekening: " + this.noRekening);
        System.out.println("Saldo: " + this.Saldo);
        this.pelajar.printInfo();
    }
}
