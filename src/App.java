
class Barang{
    String nama;
    int hargaSatuan;
    int jumlah;
}

public class App {

    static int hitungHargaTotal(int hargaSatuan,int jumlah){
        return hargaSatuan*jumlah;
    }

    static int hitungDiskon(int hargaTotal){
        if(hargaTotal>100000){
            return hargaTotal*10/100;
        }else if(hargaTotal==50000&&hargaTotal<=100000){
            return hargaTotal*5/100;
        }else{
            return 0;
        }
    }
    
    static int hitungHargaBayar(int hargaTotal , int hargaDiskon){
        return hargaTotal-hargaDiskon;
    }



    public static void main(String[] args) throws Exception {
         Barang buku = new Barang();
         buku.nama = "Buku";
         buku.hargaSatuan = 25000;
         buku.jumlah = 5;
         
        int total = hitungHargaTotal(buku.hargaSatuan, buku.jumlah);
        int diskon = hitungDiskon(total);
        int bayar = hitungHargaBayar(total, diskon);

        System.out.println("---------------------------------");
        System.out.println("Nama Barang : "+buku.nama);
        System.out.println("Total Harga : "+ total);
        System.out.println("Total Diskon : "+ diskon);
        System.out.println("Total Bayar : "+ bayar);
        System.out.println("---------------------------------");


         
    }
}
