public class Gold extends Member {
    public Gold(String produk, String jasa) {
        super(produk, jasa);
    }

    public double diskonProduk() {
        return super.diskonProduk();
    }

    public double diskonJasa() {
        return 0.15;
    }

    public double totalBayar() {
        return super.totalBayar() - ((double) super.getHargaJasa() * diskonJasa());
    }

}
