import java.util.Scanner;

public class URI1020 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdTotalDias = in.nextInt();
        int qtdAnos = qtdTotalDias / 365;
        qtdTotalDias = qtdTotalDias % 365;
        int qtdMeses = qtdTotalDias / 30;
        qtdTotalDias = qtdTotalDias % 30;
        int qtdDias = qtdTotalDias;

        // System.out.println(qtdAnos+" ano(s)\n"+qtdMeses+" mes(es)\n"+qtdDias+" dia(s)");
        System.out.printf("%d ano(s)%n",qtdAnos);
        System.out.printf("%d mes(es)%n",qtdMeses);
        System.out.printf("%d dia(s)%n",qtdDias);

        in.close();
    }
}