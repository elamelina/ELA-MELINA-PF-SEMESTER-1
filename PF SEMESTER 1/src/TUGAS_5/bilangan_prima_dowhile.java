package TUGAS_5;
import java.util.Scanner;

public class bilangan_prima_dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();
        boolean isPrime = true;

        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(N + " adalah bilangan prima.");
        } else {
            System.out.println(N + " bukan bilangan prima.");
        }
    }
}