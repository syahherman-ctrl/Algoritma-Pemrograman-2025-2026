import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int jumlah;
        float harga, diskon, totalBayar, total;

        System.out.print("Masukan Nama Barang : ");
        nama = input.next();   

        System.out.print("Masukan Harga Barang : ");
        harga = input.nextFloat();

        System.out.print("Masukan Jumlah Barang : ");
        jumlah = input.nextInt();

        total = jumlah * harga;

        if (total > 85700)
            diskon = total * 0.07f;
        else
            diskon = 0;

        totalBayar = total - diskon;

        System.out.println("===============================");
        System.out.println("Nama Barang   : " + nama);
        System.out.println("Harga Barang  : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Total Diskon  : " + diskon);
        System.out.println("Total Bayar   : " + totalBayar);

        input.close();
    }
}
