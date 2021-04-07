import java.util.Scanner;

public class URI1175 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] N = new int[20];
        int temp;
        int op = N.length-1;

        for(int i=0;i<N.length;i++){
            N[i] = in.nextInt();
        }

        for(int i=0;i<N.length;i++){
            if(op>= (N.length/2)){
                temp = N[op];
                N[op] = N[i];
                N[i] = temp;
                op--;
            }
        }

        for(int i=0;i<N.length;i++)
            System.out.printf("N[%s] = %s\n",i,N[i]);

        in.close();
    }
}