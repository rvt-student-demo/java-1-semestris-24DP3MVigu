package rvt;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Arrais {
    public static void firts_arra ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> skaitli = new ArrayList<>();
    while (true) {
        int skaitlis = scanner.nextInt();
        if ( skaitlis == -1){
            break;
        }    
        skaitli.add(skaitlis);
    }
    System.out.println("Ieraksti sākuma skaitli: ");
    int start = scanner.nextInt();
    System.out.println("Ieraksti beigu skaitli: ");
    int end = scanner.nextInt();
    for (int i = start; i<= end; i++) {
        System.out.println(skaitli.get(i));
    }
    scanner.close();
}
    public static void second_arra ( String[] args ) {
    Scanner scanneri = new Scanner(System.in);
    ArrayList<String> vardi = new ArrayList<>();
    System.out.println("Ieraksti vārdus; ");
    String vards = scanneri.nextLine();
    while(true) {
        if ( vards == "") {
            break;
        }
    vardi.add(vards);
    }
    System.out.println("Tavs vārdu skaits ir: " + vardi.size());

}
}
    public static void third_arra (String[] args);
    




