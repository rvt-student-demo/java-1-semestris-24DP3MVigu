package rvt;
import java.util.Scanner;
public class avarage_of_three_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievdi pirmo ciparu: ");
        int num1 = scanner.nextInt();
        System.out.println("Ievadi otru ciparu: ");
        int num2 = scanner.nextInt();
        System.out.println("Ievadi treso ciparu: ");
        int num3 = scanner.nextInt();
        double avrg = (num1 + num2 +num3) /3;
        System.out.println("Videjais tiem tris cipariem ir: " + avrg);
        scanner.close();
}}
