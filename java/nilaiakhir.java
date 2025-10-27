import java.util.Scanner;

public class nilaiakhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Tugas : ");
        double tugas = sc.nextDouble();
        System.out.println("Masukan Nilai UTS : ");
        double uts = sc.nextDouble();
        System.out.println("Masukan Nilai UAS : ");
        double uas = sc.nextDouble();
        
        double nilaiakhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        System.out.println("Nilai Akhir : " + nilaiakhir);
        if(nilaiakhir>=60)
            System.out.println("Status : LULUS ");
        else
            System.out.println("Status : TIDAK LULUS ");
    }
}