package TUGAS_3;

import java.util.Scanner;
public class prisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang prisma: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar prisma: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        double tinggi = scanner.nextDouble();
        double luasPermukaan = (2 * panjang * lebar + (2 * panjang * tinggi) + (2 * lebar * tinggi));
        double volume = panjang * lebar * tinggi;

        System.out.println("Luas permukaan prisma adalah: "+luasPermukaan);
        System.out.println("Volume prisma adalah: "+volume);
    }
}
