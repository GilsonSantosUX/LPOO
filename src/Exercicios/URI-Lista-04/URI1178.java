import java.util.Scanner;

public class URI1178 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] N = new double[100];
        double valor = in.nextDouble() ;
        N[0] = valor;

        for(int i=1;i<N.length;i++){
            N[i] = valor/2;
            valor = N[i];
        }
        
        for(int i=0;i<N.length;i++)
            System.out.printf("N[%d] = %.4f\n",i,N[i]);

        in.close();
    }
}