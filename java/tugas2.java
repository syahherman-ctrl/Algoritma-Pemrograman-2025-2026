import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan Jari-Jari = ");

        double r =sc.nextDouble();
        double luas = PI *r*r;

        System.out.println("Luas Lingkaran = "+ luas);
    }
    
}
