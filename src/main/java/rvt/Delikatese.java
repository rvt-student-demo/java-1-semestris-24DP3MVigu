package rvt;
import java.util.Scanner;
public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preces nosaukumu: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = scanner.nextDouble();
        System.out.println("Express piegāde? (1 - ja 0 - ne) :");
        double piegade = scanner.nextInt();
        double summa = 0;
        double piegadee = 0;
        if (piegade == 1) {
            if (summa >= 10) {
                piegadee = 2;
            } else {  
                piegadee = 10;}
        }
        summa = cena + piegadee;
        System.out.println("Reiķin: ");
        System.out.println(prece + "   " + cena);
        System.out.println("Piegade:     " + piegadee);
        System.out.println("Kopā:     " + summa);
        }
        }
    