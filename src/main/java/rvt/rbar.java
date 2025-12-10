package rvt;
import java.util.Scanner;

public class rbar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numCounter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        System.out.println("Uzraksti skaitļus:");
        while (true) {
            int skaitlis = scanner.nextInt();
            if ( skaitlis == -1) {
                System.out.println("THX BYE");
                break;
            }
            if (skaitlis % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            numCounter++;
            suma += skaitlis;
        }
        System.out.println("Summa ir " + suma);
        System.out.println("avg " + suma / Double.valueOf(numCounter));
        System.out.println("Odd numbers: " + oddCounter);
        System.out.println("Even numbers: " + evenCounter);
        scanner.close();
    }
}
