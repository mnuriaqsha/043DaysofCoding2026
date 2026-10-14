
import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        System.out.println("Masukkan angka");

        int angka = hai.nextInt();

        if (angka % 3 == 0) {
            if (angka % 5 == 0) {
                System.out.println(angka + " kelipatan 5 dan 3");
            } else {
                System.out.println(angka + " kelipatan 3 saja");
            }
        } else {
            if (angka % 5 == 0) {
                System.out.println(angka + " kelipatan 5 saja");
            } else {
                System.out.println(angka + " Bukan kelipatan 5 atau 3");
            }
        }

        hai.close();
    }
}
