package TUGAS_3;

import java.util.Scanner;
public class kerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan radius kerucut: ");
        double radius = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();
        double volume = (1.0 / 3.0) * 3.14 * (radius * radius) * tinggi;
        System.out.println("Volume kerucut adalah: "+volume);
    }
}
