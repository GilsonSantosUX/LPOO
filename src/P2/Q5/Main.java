package Q5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo polig1;
        Quadrado polig2;

        try{
            polig1  = new Triangulo(in.next(),in.nextInt(),in.nextDouble(),in.nextDouble());
            polig2 = new Quadrado(in.next(), in.nextInt(),in.nextDouble());

            System.out.println(polig1.toString());
            System.out.println(polig2.toString());

            polig1.setBase(in.nextDouble());
            polig1.setAltura(in.nextDouble());

            System.out.println(polig1.toString());

        }catch(InputMismatchException exp){
            System.out.println("Entrada Inválida!");
        }finally{
            in.close();
        }

    }
    
}
