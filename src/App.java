
class Barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int total;
    int diskon;

    int hitungHargaTotal(){
        total = hargaSatuan*jumlah;
        System.out.println("Total Harga : "+total);
        return total;
    }
    int hitungDiskon(){
        if(total>100000){
            diskon = total*10/100;
            System.out.println("Diskon : "+diskon);
            return diskon;
        }else if(total>=50000&&total<=100000){
            diskon = total*5/100;
            System.out.println("Diskon : "+diskon);
            return diskon;
        }else{
            diskon=0;
            System.out.println("Diskon : "+diskon);
            return diskon;
        }
    }
    int hitungHargaBayar(){
        int bayar = total-diskon;
        System.out.println("Bayar : "+bayar);
        return bayar;
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        Barang pulpen = new Barang();
        pulpen.nama = "pulpen";
        pulpen.hargaSatuan = 1000;
        pulpen.jumlah = 5;
        System.out.println(pulpen.nama);
        pulpen.hitungHargaTotal();
        pulpen.hitungDiskon();
        pulpen.hitungHargaBayar();
        System.out.println("------------------------------------------------");

        Barang buku = new Barang();
        buku.nama = "buku";
        buku.hargaSatuan = 6000;
        buku.jumlah = 10;
        System.out.println(buku.nama);
        buku.hitungHargaTotal();
        buku.hitungDiskon();
        buku.hitungHargaBayar();
        System.out.println("------------------------------------------------");

        Barang sepatu = new Barang();
        sepatu.nama = "sepatu";
        sepatu.hargaSatuan = 100000;
        sepatu.jumlah = 5;
        System.out.println(sepatu.nama);
        sepatu.hitungHargaTotal();
        sepatu.hitungDiskon();
        sepatu.hitungHargaBayar();
        System.out.println("------------------------------------------------");

    }
}
