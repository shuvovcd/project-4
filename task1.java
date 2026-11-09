import java.util.Scanner;
public class Main {
 public static void main(String[] args){
     Scanner Scanner = new Scanner(System.in);
     System.out.println("Enter the laptop price (p)");
     int p = Scanner.nextInt();
     System.out.println("Enter current savings (S)");
     int s = Scanner.nextInt();
     System.out.println("Enter monthly savings (m)");
     int m = Scanner.nextInt();
     int K = 0;
     if(s>p){
      K = 0;
      System.out.print("full amount is available ");
     }
     else{
         int remaining = p - s ;
         K = remaining/m;
         if(remaining % m!= 0){
             K = K + 1;
         }
     }
     System.out.print("the weeks will be (K) :" + K);
     Scanner.close();
 }
}
