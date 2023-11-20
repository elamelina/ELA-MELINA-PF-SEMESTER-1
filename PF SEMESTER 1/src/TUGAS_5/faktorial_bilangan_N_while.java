package TUGAS_5;

import java.util.Scanner;

public class faktorial_bilangan_N_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int faktorial = 1;
        int i = 1;

        while (i <= N) {
            faktorial *= i;
            i++;
        }

        System.out.println("Faktorial dari " + N + " adalah: " + faktorial);
    }
}