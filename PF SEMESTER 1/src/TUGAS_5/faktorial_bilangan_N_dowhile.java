package TUGAS_5;

import java.util.Scanner;

public class faktorial_bilangan_N_dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= N);

        System.out.println("Faktorial dari " + N + " adalah: " + factorial);
    }
}