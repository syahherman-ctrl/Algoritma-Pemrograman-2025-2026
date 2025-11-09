import java.util.Scanner;

public class Variabel {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);

      System.out.println("Nama Lengkap : ");
      String nama = input.nextLine();

      System.out.println("Tempat Tanggal Lahir :");
      String ttl = input.nextLine();

      System.out.println("Jenis Kelamin : ");
      String jk = input.nextLine();

      System.out.println("Alamat Lengkap : ");
      String alamat = input.nextLine();

      System.out.println("No Handphone : ");
      String nohp = input.nextLine();

      System.out.println("Penghasilan sebulan : ");
      String ps = input.nextLine();

      System.out.println("\nAssalamualaikum ");
      System.out.println("Izinkan saya memperkenalkan diri");
      System.out.println("Nama Lengkap : " + nama);
      System.out.println("Tempat Tanggal Lahir : " + ttl);
      System.out.println("Jenis Kelamin : " + jk);
      System.out.println("Alamat Lengkap : "+ alamat);
      System.out.println("No Handphone : " + nohp);
      System.out.println("Penghasilan Sebulan : " + ps);
      


    }      
}
