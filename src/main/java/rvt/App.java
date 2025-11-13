package rvt;

public class App {
    public static void main(String[] args) {
                public class Statistics{
        private int count;

        public Statistics() {
            this.count = 0;
            this.sum = 0;
    }
        public void addNumber(int number) {
            this.sum = this.sum + number;
            this.count++;
    }

        public int getCount() {
            return this.count;
    }
        public int sum() {
            return this.sum();
    }

        public double average() {
            return this.sum() / (double) this.count;
    }

        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics allnumbers = new Statistics();
        Statistics oddnumbers = new Statistics();
        System.out.println("Ievadi skaitļus:");
        while(true) {
            int number = scanner.nextInt();
            if (number == 1){
                break;
            }
        }
        allNumbers.addNumber(number);

        if (number % 2 == 0){
            evenNumbers.addnumber(number);
        } else{
            oddNumbers.addNumber(number);
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
} 
    

