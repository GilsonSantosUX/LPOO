import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int qtd = in.nextInt();
        int valor = in.nextInt();
        int[] N = new int[qtd];
        N[0] = valor;

        for(int i=1;i<N.length;i++){
            N[i] = valor*3;
            valor = N[i];
        }
        
        for(int i=0;i<N.length;i++)
            System.out.printf("v[%d] = %d\n",i,N[i]);
        
        in.close();
    }
}
