package Aula03.URI;

import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int CD = C + D;
        int AB = (A+B);

        if(B>C && D>A && CD > AB && C>=0 && D>=0 && (A % 2) == 0 ){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }


        in.close();
    }
}
