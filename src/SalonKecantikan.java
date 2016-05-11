public abstract class SalonKecantikan {

    private String keanggotaan, nama, produk, jasa, namaProduk, namaJasa;
    private int hargaProduk = 0, hargaJasa = 0;
    protected double totalBayar;
    private String daftarProduk[] = {"kritih", "mibut", "krisih",
        "caphatit", "krilangda", "tidak ada"};
    private int daftarHargaProduk[] = {20000, 55000, 75000, 80000, 35000, 0};
    private String daftarJasa[] = {"whitening", "softening",
        "cleaning", "tambal bibir", "perawatan rutin", "tidak ada"};
    private int daftarHargaJasa[] = {150000, 155000, 215000, 250000, 120000, 0};
    public SalonKecantikan(String keanggotaan, String nama) {
        this.keanggotaan = keanggotaan;
        this.nama = nama;
    }

    public SalonKecantikan() {
    }

    public String getKeanggotaan() {
        return keanggotaan;
    }

    public String getNama() {
        return nama;
    }

    public void setHargaProduk(String produk) {
        for (int i = 0; i < daftarProduk.length; i++) {
            if (daftarProduk[i].equalsIgnoreCase(produk)) {
                namaProduk = daftarProduk[i];
                hargaProduk = daftarHargaProduk[i];
            }
        }
    }

    public String getProduk() {
        return namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaJasa(String jasa) {
        for (int i = 0; i < daftarJasa.length; i++) {
            if (daftarJasa[i].equalsIgnoreCase(jasa)) {
                namaJasa = daftarJasa[i];
                hargaJasa = daftarHargaJasa[i];
            }
        }
    }

    public String getJasa() {
        return namaJasa;
    }

    public int getHargaJasa() {
        return hargaJasa;
    }

    public abstract double diskonProduk();

    public abstract double diskonJasa();

    public double totalBayar() {
        return (double) getHargaProduk() + (double) getHargaJasa();
    }
}