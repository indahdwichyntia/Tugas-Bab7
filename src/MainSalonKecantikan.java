import java.util.Scanner;
public class MainSalonKecantikan {

    public static void main(String[] args) {
        SalonKecantikan[] member = new SalonKecantikan[10];
        SalonKecantikan pelanggan;
        String pilihan;
        int i = 0;
        double total = 0;
        System.out.println("=================================================");
        System.out.println("============= SALON KECANTIKAN SUPER =============");
        System.out.println("=================================================");
        System.out.print("Masukkan nama Anda\t: ");
        String nama = input();
        System.out.print("Jenis keanggotaan"
                + "\n(Premium | Gold | Silver | Non-anggota)"
                + "\nPilih\t\t\t: ");
        String keanggotaan = input();
        pelanggan = new Member(keanggotaan, nama);
        daftarJasaProduk();
        String produk, jasa;
        do {
            System.out.print("Pilih produk (misal: kritih)\t: ");
            produk = input();
            System.out.print("Pilih jasa (misal: whitening)\t: ");
            jasa = input();
            if (keanggotaan.equalsIgnoreCase("premium")) {
                member[i] = new Premium(produk, jasa);
                member[i].setHargaProduk(produk);
                member[i].setHargaJasa(jasa);
                total += member[i].totalBayar();
            } else if (keanggotaan.equalsIgnoreCase("gold")) {
                member[i] = new Gold(produk, jasa);
                member[i].setHargaProduk(produk);
                member[i].setHargaJasa(jasa);
                total += member[i].totalBayar();
            } else if (keanggotaan.equalsIgnoreCase("silver")) {
                member[i] = new Silver(produk, jasa);
                member[i].setHargaProduk(produk);
                member[i].setHargaJasa(jasa);
                total += member[i].totalBayar();
            } else if (keanggotaan.equalsIgnoreCase("non-anggota")) {
                member[i] = new NonMember(keanggotaan, nama, produk, jasa);
                member[i].setHargaProduk(produk);
                member[i].setHargaJasa(jasa);
                total += member[i].totalBayar();
            }
            System.out.print("Tambah lagi? [y/n]\t\t: ");
            pilihan = input();
            i++;
        } while (!pilihan.equalsIgnoreCase("n"));
        System.out.println("=================================================");
        System.out.println("                  DATA PELANGGAN                 ");
        System.out.println("Nama\t\t: " + pelanggan.getNama());
        System.out.println("Keanggotaan\t: " + pelanggan.getKeanggotaan());
        System.out.println("=================================================");
        System.out.println("Produk/Jasa\tHarga\tPotongan");
        for (int j = 0; j < i; j++) {
            System.out.println(member[j].getProduk() + "\t" + member[j].getHargaProduk() + "\t" + member[j].diskonProduk());
            System.out.println(member[j].getJasa() + "\t" + member[j].getHargaJasa() + "\t" + member[j].diskonJasa());
        }
        System.out.println("=================================================");
        System.out.println("Total Bayar\t: Rp " + total);
        System.out.println("=================================================");
    }

    public static void daftarJasaProduk() {
        System.out.println("\n================== Daftar Produk ================"
                + "\nNama\t\t\t\t\tHarga"
                + "\n1. kritih\t(Krim Pemutih)\t\tRp 20000 "
                + "\n2. mibut\t(Minyak Pelembut)\tRp 55000 "
                + "\n3. krisih\t(Krim Pembersih)\tRp 75000 "
                + "\n4. caphatit\t(Capsul Kesehatan Kulit)Rp 80000 "
                + "\n5. krilangda\t(Krim Penghilan Noda)\tRp 35000 ");
        System.out.println("\n=================== Daftar Jasa ================="
                + "\n1. whitening\t\t\t\tRp 150000 "
                + "\n2. softening\t\t\t\tRp 155000 "
                + "\n3. cleaning\t\t\t\tRp 215000 "
                + "\n4. tambal bibir\t\t\t\tRp 250000 "
                + "\n5. perawatan rutin\t\t\tRp 120000 ");
        System.out.println("\n*Jika kosong isi dengan \"tidak ada\"");
        System.out.println("=================================================");
    }

    static String input() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }   
}