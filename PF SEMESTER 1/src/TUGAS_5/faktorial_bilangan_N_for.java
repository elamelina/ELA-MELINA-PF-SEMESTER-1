package TUGAS_5;

import java.util.Scanner;

public class faktorial_bilangan_N_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int faktorial = 1;

        for (int i = 1; i <= N; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + N + " adalah: " + faktorial);
    }
}