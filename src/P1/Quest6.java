import java.io.IOException;
import java.util.Scanner;
public class Quest6 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int[][] matriz = new int[6][6];
        int num = in.nextInt();
        if(num>0 && num<5){
            InputMatriz(matriz);
            BustaMenor(matriz, 6, 6, num);
        }

        in.close();
    }

    public static void BustaMenor(int[][] matriz,int row,int col,int linha){
        int menor = matriz[linha][0];
        int position = 0;

        for(int i=1;i<matriz.length;i++){
            if(matriz[linha][i] < menor){
                menor = matriz[linha][i];
                position = i;
            }
        }

        System.out.println(menor);
        System.out.println(linha+" "+position);

    }

    public static void InputMatriz(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j] = in.nextInt();
            }
        }
    }
 
}