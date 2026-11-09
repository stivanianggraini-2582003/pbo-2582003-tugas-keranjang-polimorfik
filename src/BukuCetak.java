public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        int ongkir = (int) Math.ceil((double) beratGram / 500) * 5000;
        return getHarga() + ongkir;
    }

    @Override
    public String keterangan() {
        int ongkir = (int) Math.ceil((double) beratGram / 500) * 5000;
        String formatOngkir = String.format("%,d", ongkir).replace(',', '.');
        return beratGram + " gram, ongkir Rp" + formatOngkir;
    }
}