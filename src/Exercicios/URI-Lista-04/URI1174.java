import java.util.Scanner;

public class URI1174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] A = new double[100];

        for(int i=0;i<A.length;i++)
            A[i] = in.nextDouble();

        for(int i=0;i<A.length;i++){
            if(A[i]<=10)
                System.out.printf("A[%s] = %.1f\n",i,A[i]);
        }

        in.close();
    }
}
