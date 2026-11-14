public class TokoBuku {
    // Menghitung total harga akhir seluruh buku dalam keranjang.
    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku b : keranjang) {
            total += b.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        /*
         * Ketentuan Nomor 6:
         * Pesan error saat dijalankan:
         * Buku.java: error: Buku is abstract; cannot be instantiated
         */
        // Buku b = new Buku("X", "Y", 1);

        // Buat objek masing-masing buku
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        // Masukkan ke array polimorfik keranjang
        Buku[] keranjang = { cetak1, cetak2, digital, audio };

        // Masukkan yang bisa diunduh ke array BisaDiunduh
        BisaDiunduh[] unduhan = { digital, audio };

        // Tampilkan Keranjang
        System.out.println("=============== KERANJANG ===============");
        for (Buku b : keranjang) {
            b.tampilkanInfo();
        }
        System.out.println("-----------------------------------------");

        // Cetak Total Bayar
        String totalBayarStr = String.format("%,d", hitungTotal(keranjang)).replace(',', '.');
        System.out.println("Total bayar   : Rp" + totalBayarStr);

        // Tampilkan Link Unduh
        System.out.println("\n============== LINK UNDUH ===============");
        for (BisaDiunduh d : unduhan) {
            System.out.println(d.linkUnduh());
        }
    }
}