public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    // Method abstract
    public abstract int hargaAkhir();
    public abstract String keterangan();

    // Method konkret untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : Rp" + String.format("%,d", harga).replace(',', '.'));
        System.out.println("  Keterangan  : " + keterangan());
        System.out.println("  Harga akhir : Rp" + String.format("%,d", hargaAkhir()).replace(',', '.'));
    }
}