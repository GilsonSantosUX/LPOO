import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtd = in.nextInt();
        int[] vetor = new  int[qtd];
        vetor[0] = in.nextInt();
        int menor = vetor[0];
        int position = 0;

        for(int i=1;i<qtd;i++){
            vetor[i] = in.nextInt();
            if(vetor[i] < menor){
                menor = vetor[i];
                position = i;
            }
        }
        
        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+position);
        in.close();
    }
}