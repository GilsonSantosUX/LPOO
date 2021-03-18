import java.io.IOException;
import java.util.Scanner;

public class Soma {
    public static void main() {
        int A,B,X;
        
        Scanner in = new Scanner(System.in);
        
        A = in.nextInt();
        B = in.nextInt();
        in.close();
        
        X = A+B;
        
        System.out.println("X = "+X);
    }
}
