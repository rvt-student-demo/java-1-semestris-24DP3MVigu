package rvt;
import java.util.Scanner;
public class numbers_and_sum_of_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skaitli = 0;
        int summa = 0;
        while(true){
            System.out.println("Ievadi skaitli (0 lai beigtu): ");
            int ievade = scanner.nextInt();
            summa += ievade;
            skaitli++;
            if (ievade == 0) {
                break;
            }
        }
        skaitli --;
        System.out.println("Ievadīto skaitļu skaits ir: " + skaitli);
        System.out.println("Tavu skaitļu summa ir: " + summa);
    }
}
