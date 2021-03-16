import java.util.ArrayList;
import java.util.Scanner;

// Packages
import Pessoa.Pessoa;

public class Intro{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        Pessoa pessoa;
        int qtd=0;


        System.out.println("Quantidade de pessoas:");
        qtd = in.nextInt();
        System.out.println();

        for(int i=0;i<qtd;i++){
            pessoa = new Pessoa();
            System.out.println("Informe seu nome completo:");
            pessoa.setNome(in.next());
            System.out.println("Informe sua idade:");
            pessoa.setIdade(in.nextInt());
            System.out.println("Informe seu cpf:");
            pessoa.setCpf(in.next());
            lista_pessoas.add(pessoa);
            System.out.println("==========================");
        }

        // Gilson
        // 26
        // 04391218178
        // Ghabrielly
        // 23
        // 06245333405

        in.close();
        System.out.println("==========================");

        boolean cond = lista_pessoas.get(0).equals(lista_pessoas.get(1));
        
        System.out.println("Pessoa 1 é igual a Pessoa 2? "+cond);

        System.out.println(lista_pessoas.size());

        for (Pessoa p : lista_pessoas) {
            System.out.println(p.toString());
        }
        
    }
}