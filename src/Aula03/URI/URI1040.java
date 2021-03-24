// package Aula03.URI;

import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =0;
        float[] nota = new float[5];
        float[] media = new float[2];

        while(i<4){
            nota[i] = in.nextFloat();
            i++;
        }
        media[0] = ((nota[0]*2)+(nota[1]*3)+(nota[2]*4)+(nota[3]*1))/10;
        System.out.printf("Media: %.1f\n",media[0]);
        
        if(media[0]>=7.0) System.out.println("Aluno aprovado.");
        else if(media[0]>=5.0 && media[0]<=6.9){
            System.out.println("Aluno em exame.");
            nota[i] = in.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",nota[i]);
            media[1] = (media[0]+nota[4])/2;
            if(media[1]>5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",media[1]);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",media[1]);
            }
        }else{
            System.out.println("Aluno reprovado.");
        }
        in.close();
    }
}
