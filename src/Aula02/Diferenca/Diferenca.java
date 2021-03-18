import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int A,B,C,D,X;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        X = (A*B)-(C*D);
        System.out.println("DIFERENCA = "+X);
    }
}
