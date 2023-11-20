package TUGAS_5;
import java.util.Scanner;

public class deret_fibonacci_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci: ");
        int N = input.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int i = 1;

        System.out.println("Deret Fibonacci hingga " + N + " bilangan:");
        while (i <= N) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            i++;
        }
    }
}