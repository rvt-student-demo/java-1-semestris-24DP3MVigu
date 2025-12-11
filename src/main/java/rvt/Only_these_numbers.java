package rvt;
import java.util.Scanner;

public class Only_these_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numbers[] = new int[100];
        System.out.println("ieraksti jebkurus ciparus (-1 lai beigtu) :");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers[count] = num; 
            count++;
        }
            

            System.out.println("No cik?");
            int start = scanner.nextInt();
            System.out.println("Lidz cik?");
            int end = scanner.nextInt();

            for ( int i = start; i <= end; i++) {
                System.out.println(numbers[i]);
            }

    
        scanner.close();
    
}
}