import java.util.Scanner;

public class URI1182 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
        int num = in.nextInt();
        if(num>0 && num<11){
            String op = in.next();
            InputMatriz(matriz);
            //boolean ativo = true;
            //while(ativo){
                switch(op){
                    case "S":
                        System.out.printf("%.1f\n",SomaCol(matriz, matriz.length, matriz[0].length, num));
                    break;
                    case "M":
                        System.out.printf("%.1f\n",SomaCol(matriz, matriz.length,matriz[0].length, num)/matriz.length);
                    break;
                    default:
                        ativo = false;
                    break;
                }
             //   op = in.next();
            //}
            

        }

        in.close();
    }

    public static double Soma(double[][] matriz,int row,int col,int y){
        double soma = 0;
        for(int i=0;i<matriz.length;i++){
            soma += matriz[i][y];
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