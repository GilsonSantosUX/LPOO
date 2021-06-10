import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        double o = 0;

        try{
            x = in.nextInt();
            y = in.nextInt();
            o = (x/y);
            System.out.printf("%.1f\n", o);
        }catch(InputMismatchException erro1){
            System.out.println("Caractere inválido");
        }catch(ArithmeticException erro2){
            System.out.println("Erro de divisão por zero");
        }
    }
}