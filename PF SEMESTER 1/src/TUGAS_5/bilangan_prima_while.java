package TUGAS_5;
import java.util.Scanner;

public class bilangan_prima_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();
        int i = 2;
        boolean isPrime = true;

        while (i <= N / 2) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(N + " adalah bilangan prima.");
        } else {
            System.out.println(N + " bukan bilangan prima.");
        }
    }
}
