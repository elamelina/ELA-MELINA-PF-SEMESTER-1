package TUGAS_6;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_handling
{
    public static void main(String[] args) {
        File evidence = new File("cookedBooks.txt");
        if (evidence.exists()) {
            Scanner keyboard = new Scanner(System.in);
            char reply;

            do {
                System.out.print("Delete evidence? (y/n) ");
                reply = keyboard.next().charAt(0);
            } while (reply != 'y' && reply != 'n');

            if (reply == 'y') {
                System.out.println("Okay, here goes...");
                try {
                    if (evidence.delete()) {
                        System.out.println("The evidence has been deleted.");
                    } else {
                        System.out.println("Failed to delete the evidence.");
                    }
                } catch (SecurityException e) {
                    System.out.println("Unable to delete the evidence due to security restrictions.");
                }
            } else {
                System.out.println("Sorry, buddy. Just asking.");
            }
            keyboard.close();
        }
    }
}