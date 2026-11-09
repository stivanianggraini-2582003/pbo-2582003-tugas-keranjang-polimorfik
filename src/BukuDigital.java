public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return (int) (getHarga() * 0.8); // Diskon 20%
    }

    @Override
    public String keterangan() {
        return ukuranMB + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String formattedJudul = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/ebook/" + formattedJudul;
    }
}