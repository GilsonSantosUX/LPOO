import java.util.Scanner;

public class PROD {
    public static void main(String[] args) {
        int A,B,X;
        Scanner in = new Scanner(System.in);
        
        A = in.nextInt();
        B = in.nextInt();
        
        X = A*B;
        
        System.out.println("PROD = "+X);
        
    }
}
