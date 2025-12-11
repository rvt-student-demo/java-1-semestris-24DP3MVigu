package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class List_size {
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();
        String end = "";

        String vards = scanner.nextLine();
        List.add(vards);


        while (true) {
            vards = scanner.nextLine();
            
            if (vards.equals(end)) {
                break;
            }
            List.add(vards);
        }
        
        
        System.out.println(List.size());
        scanner.close();
    }}