import java.util.Scanner;

public class URI1172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int i=0;i<vetor.length;i++)
            vetor[i] = in.nextInt();

        for(int i=0;i<vetor.length;i++){
            if(vetor[i] <= 0)
                vetor[i] = 1;
        }

        for (int i=0;i<vetor.length;i++) {
            System.out.println("X["+i+"] = "+vetor[i]);
        }
        
        in.close();
    }
}