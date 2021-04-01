import java.util.Scanner;

public class URI1073{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        for(int i=2;i<=valor;i = i + 2){
            System.out.println(i+"^"+"2 = "+i*i);
        }

        in.close();
    }
}