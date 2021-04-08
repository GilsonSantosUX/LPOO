import java.util.Scanner;

public class URI1183 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
            String op = in.next();
            InputMatriz(matriz);
            switch(op){
                case "S":
                    System.out.printf("%.1f\n",Soma(matriz, matriz.length, matriz[0].length));
                break;
                case "M":
                    System.out.printf("%.1f\n",Soma(matriz, matriz.length,matriz[0].length)/66.0);
                break;
            }
        in.close();
    }

    public static double Soma(double[][] matriz,int row,int col){
        double soma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=i+1;j<matriz.length;j++)
                soma += matriz[i][j];
        }
        return soma;
    }


    public static void InputMatriz(double[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j] = in.nextDouble();
            }
        }
    }
}