package rvt;
import java.util.Scanner;
public class seconds_in_a_day {
    public static void main(String[] args) {
        System.out.println("Ieraksti cik dienas pārveidot uz sekundēm: ");
        Scanner scanner = new Scanner(System.in);
        int dienas = scanner.nextInt();
        int sekundes = dienas * 60 * 60 * 24;
        System.out.println("Tās ir " + sekundes + "sekundes.");
    }
}
