package TUGAS_4;

import java.util.Scanner;
public class huruf_ke_indeks_SWITCH
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);
        scanner.close();

        double nilaiKonversi = 0.0;

        switch (nilaiHuruf) {
            case 'A':
                nilaiKonversi = 4.0;
                break;
            case 'B':
                nilaiKonversi = 3.0;
                break;
            case 'C':
                nilaiKonversi = 2.0;
                break;
            case 'D':
                nilaiKonversi = 1.0;
                break;
            case 'E':
                nilaiKonversi = 0.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui.");
                System.exit(1);
            }
            System.out.println("Nilai Konversi: "+nilaiKonversi);
        }

    }