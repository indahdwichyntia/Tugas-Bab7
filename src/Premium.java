public class Premium extends Member {
        public Premium(String produk, String jasa) {
        super(produk, jasa);
    }

    public double diskonProduk() {
        return super.diskonProduk();
    }

    public double diskonJasa() {
        return 0.2;
    }

    public double totalBayar() {
        return super.totalBayar() - ((double) super.getHargaJasa() * diskonJasa());
    } 
}