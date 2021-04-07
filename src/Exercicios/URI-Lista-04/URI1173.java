import java.util.Scanner;

public class URI1173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];

        int valor = in.nextInt();

        for(int i=0;i<vetor.length;i++){
            vetor[i] = valor;
            valor += vetor[i];
        }

        for (int i=0;i<vetor.length;i++)
            System.out.println("N["+i+"] = "+vetor[i]);

        in.close();
    }
}