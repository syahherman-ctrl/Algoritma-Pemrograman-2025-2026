import java.util.Scanner;

public class angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Angka Pertama : ");
        int a = sc.nextInt();
        System.out.println("Masukan Angka Kedua");
        int b = sc.nextInt();

        if (a < b)
            System.out.println(a + "lebih besar dari " + b);
        else 
            System.out.println("keduanya sama besar");

            System.out.println("Apakah keduanya sama? " + (a == b));
    }
}