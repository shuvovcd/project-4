import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter numbers one by one (enter 0 to stop):");

        int number = input.nextInt();

        while (number != 0) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = input.nextInt();
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        input.close();
    }
}
