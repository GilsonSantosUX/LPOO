import java.util.Scanner;

public class URI1072{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        int[] valor = new int[op];
        int out = 0;
        int inn = 0;

        for(int i=0;i<op;i++){
            valor[i] = in.nextInt();
        }

        for (int i : valor) {
            if(i>=10 && i<=20) inn++;
            else out++;
        }

        System.out.println(inn+" in");
        System.out.println(out+" out");
        
        in.close();
    }
}