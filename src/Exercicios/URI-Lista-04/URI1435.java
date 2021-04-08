import java.util.Scanner;

public class URI1435 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz;
        int op = 0;
        do{
            op = in.nextInt();
            matriz = new int[op][op];
            InputMatriz(matriz);
            PrintMatriz(matriz);
        }while(op != 0);
        
        in.close();
    }

    public static void InputMatriz(int[][] matriz){
        int iniMatriz = 0;
        int fimMatriz = matriz.length;
        int elemento = 1;

        while(true)
        {
            for(int linha = iniMatriz; linha < fimMatriz; linha++){
                for (int coluna = iniMatriz; coluna < fimMatriz; coluna++)
                    matriz[linha][coluna] = elemento;
            }
            if (fimMatriz == 0)
                break;
            fimMatriz--;
            iniMatriz++;
            elemento++;
        }

    }

    public static void PrintMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println();
        }
    }
}