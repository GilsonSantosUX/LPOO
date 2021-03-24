// package Aula03.URI;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;
        int op = in.nextInt();
        int qtd = in.nextInt();

        switch(op){
            case 1:
                valor = 4.00*qtd;
            break;
            case 2:
                valor = 4.50*qtd;
            break;
            case 3:
                valor = 5.00*qtd;
            break;
            case 4:
                valor = 2.00*qtd;
            break;
            case 5:
                valor = 1.50*qtd;
            break;
            default:
                valor = 0.00;
        }

        System.out.printf("Total: R$ %.2f\n",valor);

        in.close();
    }
}
