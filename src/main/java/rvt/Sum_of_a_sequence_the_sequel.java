package rvt;

import java.util.Scanner;

public class Sum_of_a_sequence_the_sequel {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int suma = 0;
    System.out.println("Ievad no cik: ");
    int pirmais = scanner.nextInt();
    System.out.println("Ievadi beigu skaitli (neieskaitot): ");
    int otrais = scanner.nextInt();
    for (int i = pirmais; i < otrais; i++) {
        suma += pirmais;
        pirmais++;
    }
    System.out.println("Summa ir " + suma);
    scanner.close();
}
}       