public class NonMember extends SalonKecantikan {
    public NonMember(String keanggotaan, String nama, String produk, String jasa) {
        super(keanggotaan, nama);
        super.setHargaProduk(produk);
        super.setHargaJasa(jasa);
    }

    public double diskonProduk() {
        return 0;
    }

    public double diskonJasa() {
        return 0;
    }

    public double totalBayar() {
        return super.totalBayar() - ((double) super.getHargaProduk() * diskonProduk());
    }
}