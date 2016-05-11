public class Silver extends Member {
    public Silver(String produk, String jasa) {
        super(produk, jasa);
    }

    public double diskonProduk() {
        return super.diskonProduk();
    }

    public double diskonJasa() {
        return 0.1;
    }

    public double totalBayar() {
        return super.totalBayar() - ((double) super.getHargaJasa() * diskonJasa());
    }
}