// package Aula03.URI;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,C;
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();
        int temp;
        A = X;
        B = Y;
        C = Z;

        if(X>Y){
            temp = X;
            X = Y;
            Y = temp;
        }
        if(X>Z){
            temp = X;
            X = Z;
            Z = temp;
        }
        if(Y>Z){
            temp = Y;
            Y = Z;
            Z = temp;
        }

        System.out.printf("%d\n%d\n%d\n",X,Y,Z);
        System.out.println();
        System.out.printf("%d\n%d\n%d\n",A,B,C);

        in.close();
    }

}
