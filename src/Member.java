public class Member extends SalonKecantikan {
    public Member(String keanggotaan, String nama) {
        super(keanggotaan, nama);
    }
    
    public Member() {
        
    }

    public double diskonProduk() {
        return 0.1;
    }
    
    @Override
    public double diskonJasa() {
        return 0;
    }

    public double totalBayar() {
        return super.totalBayar() - ((double) super.getHargaProduk() * diskonProduk());
    }
    
}