package projetovacina;

import java.util.ArrayList;
import java.util.Scanner;

public class Starting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        Pessoa pessoa;
        int qtd = in.nextInt();

        while(qtd > 0){
            pessoa = new Pessoa(in.next(),in.nextInt(),in.next(),in.next());
            listaPessoas.add(pessoa);
            qtd--;
        }

        for (Pessoa p : listaPessoas) {
            System.out.println(p);
        }
    }
}
