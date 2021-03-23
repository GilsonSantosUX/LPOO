import java.util.Scanner;

class ControlFlow {
    static Scanner in = new Scanner(System.in);
    static int binary;
    public static void main(String[] args) {
        
        // Intervalo();
        // Soma();
        // Multi();
        // Media();
        // intToBinary(8);
        System.out.println(findBinary(8));
    }

    public static void intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        System.out.println(s);
    }

    public static int findBinary(int decimal){
        if (decimal == 0)  return 0;
        else return decimal % 2 + 10 * (findBinary(decimal / 2));
    }

    public static void Intervalo(){
        for(int i = 150;i<=300;i++){
            System.out.println(i);
        }
    }

    public static void Soma(){
        for(int i = 1;i<=1000;i++){
            System.out.println(i+i);
        }
    }

    public static void Multi() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) System.out.println(i);
        }
    }

    public static void Media() {
        int cont,count;
        double result = 0;
        cont = in.nextInt();
        double[] media = new double[10];
        count = 0;

        while(cont != -1){
            System.out.println("Informe a media:");
            media[count] = in.nextDouble();
            count++;
            System.out.println("Deseja continuar a inserir a media? Sim = 0 ou Não  = -1");
            cont = in.nextInt();
        }
        in.close();

        for(int i=0;i<=count;i++){
            result += media[i];
        }

        result = (result/count);

        if(result <= 6) System.out.println("Reprovado! "+result);
        else System.out.printf("Aprovado! %.2f\n",result);
    }
}