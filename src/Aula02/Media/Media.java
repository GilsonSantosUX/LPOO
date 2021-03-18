import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double A,B,X;
        Scanner in = new Scanner(System.in);
        
        A = in.nextDouble();
        B = in.nextDouble();
        X = ((A*3.5)+(B*7.5))/11;
        
        System.out.printf("MEDIA = %.5f\n",X);
    }
}
