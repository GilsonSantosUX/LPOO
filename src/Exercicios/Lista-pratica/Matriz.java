import java.util.Scanner;

public class Matriz {
    private static Scanner in = new Scanner(System.in);;
    private int[][] matriz;
    
    public Matriz(){
        matriz = new int[4][4];
    }

    public void lerMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j] = in.nextInt();
            }
        }
    }

    public void maiorLinha(){
        int index = in.nextInt();
        int maior=0;
        int id =0;
        if(index<=this.matriz.length){
            maior = matriz[index][0];
            for(int i = 0;i<matriz.length;i++){
                if(maior<matriz[index][i]){
                    maior = matriz[index][i];
                    id = i;
                }
            }
        }
        in.close();
        System.out.println(maior+" "+id);
    }

    public int somaAcimaDiagonalPrincipal(){
        int soma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=i+1;j<matriz.length;j++)
                soma += matriz[i][j];
        }
        return soma;
    }

    public static void main(String[] args){
        Matriz matriz = new Matriz();
        matriz.lerMatriz();
        matriz.maiorLinha();
        System.out.println(matriz.somaAcimaDiagonalPrincipal());
    }
}
