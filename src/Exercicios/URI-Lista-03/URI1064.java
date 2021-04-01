import java.util.Scanner;

public class URI1064{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtd = 0;
        double tot =0;
        double[] valores = new double[6];

        for(int i=0;i<valores.length;i++){
            valores[i] = in.nextDouble();
        }
        
        for (double d : valores) {
            if(d>=0){
                qtd++;
                tot += d;
            }
        }
        in.close();
        System.out.println(qtd+" valores positivos");
        System.out.printf("%.1f\n",(tot/qtd));
    }
}

