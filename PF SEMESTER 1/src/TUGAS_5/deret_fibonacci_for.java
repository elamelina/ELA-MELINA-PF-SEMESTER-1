package TUGAS_5;
import java.util.Scanner;

public class deret_fibonacci_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci: ");
        int N = input.nextInt();
        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Deret Fibonacci hingga " + N + " bilangan:");
        for (int i = 1; i <= N; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}