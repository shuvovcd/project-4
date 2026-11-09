import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        File myFile = new File("duomenys.txt");
        Scanner reader = new Scanner(myFile);

        int n = reader.nextInt();
        int negativeCount = 0;

        int i = 1;
        while (i <= n) {
            int temp = reader.nextInt();
            
            if (temp < 0) {
                negativeCount = negativeCount + 1;
            }
            
            i = i + 1; 
        }

        reader.close();

        if (negativeCount > 0) {
            System.out.println("Days with negative temperature: " + negativeCount);
        } else {
            System.out.println("No negative temperatures recorded");
        }
    }
}
