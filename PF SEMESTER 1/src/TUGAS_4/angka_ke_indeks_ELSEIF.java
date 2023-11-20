package TUGAS_4;
import java.util.Scanner;
public class angka_ke_indeks_ELSEIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (0-100): ");
        int angka = input.nextInt();

        if (angka >= 0 && angka <= 100) {
            double nilaiIndeks;

            if (angka >= 80 && angka <= 100) {
                nilaiIndeks = 4.0;
            } else if (angka >= 70 && angka <= 79.99) {
                nilaiIndeks = 3.0;
            } else if (angka >= 60 && angka <= 69.99) {
                nilaiIndeks = 2.0;
            } else if (angka >= 50 && angka <= 59.99) {
                nilaiIndeks = 1.0;
            } else if (angka >= 0 && angka <= 49.99) {
                nilaiIndeks = 0.0;
            } else {
                nilaiIndeks = '6';
            }
            System.out.println("Nilai indeks: " + nilaiIndeks);
        } else {
            System.out.println("Angka tidak valid. Harap masukkan angka 0-100.");
        }
        input.close();
    }
}
