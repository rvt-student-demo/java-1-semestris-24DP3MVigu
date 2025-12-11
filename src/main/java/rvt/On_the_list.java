package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class On_the_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Ieraksti vardus (enter lai beigtu) :");
        while(true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }
        System.out.println("Ieraksti kuru tu mekle: ");
        String searc = scanner.nextLine();
        if (names.contains(searc)) {
            System.out.println(searc + " tika atrasts!");
        } else {
            System.out.println(searc + " netika atrasts");
        }


}
}