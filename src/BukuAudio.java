public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        return (int) (getHarga() * 0.9); // Diskon 10%
    }

    @Override
    public String keterangan() {
        return durasiMenit + " menit, diskon 10%";
    }
    // Membuat link unduh berdasarkan judul buku audio.
    @Override
    public String linkUnduh() {
        String formattedJudul = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/audio/" + formattedJudul;
    }
}