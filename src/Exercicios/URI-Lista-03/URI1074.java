import java.util.Scanner;

public class URI1074{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        int[] valor = new int[op];

        for(int i=0;i<op;i++){
            valor[i] = in.nextInt();
        }

        for (int i : valor) {
            if(i%2==0){
                if(i==0) System.out.println("NULL");
                else if(i>=0) System.out.println("EVEN POSITIVE");
                else System.out.println("EVEN NEGATIVE");
            }else{
                if(i>=0) System.out.println("ODD POSITIVE");
                else System.out.println("ODD NEGATIVE");
            }
        }

        in.close();
    }
}