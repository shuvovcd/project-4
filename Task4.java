import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        File myFile = new File("src/duomenys.txt");
        Scanner reader = new Scanner(myFile);

        int n = reader.nextInt();
        
        if (n < 2) {
            System.out.println(0);
            reader.close();
            return;
        }

        int count = 0;
        int leftNeighbor = reader.nextInt();

        int i = 2;
        while (i <= n) {
            int currentNumber = reader.nextInt();
            
            if (currentNumber < leftNeighbor) {
                count = count + 1;
            }
            
            leftNeighbor = currentNumber;
            i = i + 1;
        }

        reader.close();

        System.out.println(count);
    }
}
