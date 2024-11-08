public class Pelajar {
    private String Nama;
    private int Umur;
    private String Alamat;
    
    public Pelajar(String Nama, int Umur, String Alamat) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Alamat = Alamat;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public int getUmur() {
        return Umur;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void printInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + Umur);
        System.out.println("Alamat: " + Alamat);
    }
}
