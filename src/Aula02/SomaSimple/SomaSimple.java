import java.util.Scanner;
public class SomaSimple {
    public static void main(String[] args) throws IOException {
        int A,B,X;
        Scanner in = new Scanner(System.in);
        
        A = in.nextInt();
        B = in.nextInt();
        X = A+B;
        
        System.out.println("SOMA = "+X);
    }
}
