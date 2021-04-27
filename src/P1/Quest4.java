import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int qtdPar = 0;
        int qtdImpar = 0;
        int qtdP = 0;
        int qtdN = 0;
        int qtdZ = 0;
        int op = in.nextInt();
        int[] valores = new int[op];


        for(int i=0;i<valores.length;i++){
            valores[i] = in.nextInt();
        }
        
        for (int d : valores) {
            if(d==0) qtdZ++;
            if(d>=0){
                if(d!=0) qtdP++;
                if(d%2==0) {
                    if(d!=0) qtdPar++;
                }
                else qtdImpar++;
            }else{
                qtdN++;
                if(d%2==0) qtdPar++;
                else qtdImpar++;
            }
        }

        in.close();
        System.out.println(qtdPar+" valor(es) par(es)");
        System.out.println(qtdImpar+" valor(es) impar(es)");
        System.out.println(qtdP+" valor(es) positivo(s)");
        System.out.println(qtdN+" valor(es) negativo(s)");
        System.out.println(qtdZ+" valor(es) zero(s)");
    }
    
}
