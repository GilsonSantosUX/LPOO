import java.util.Scanner;

public class URI1075{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtd = in.nextInt();

        for(int i=0; i<=10000; i++) {
            if(i%qtd == 2){
                System.out.println(i);
            }
        }

        in.close();
    }
}