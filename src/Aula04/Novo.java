import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JSpinner.DateEditor;

import Pessoa.Pessoa;

public class Novo {
    public static void main(String[] args) {
        ArrayList<Pessoa> listPessoa = new ArrayList<Pessoa>();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantidade de pessoas:");
        int op = in.nextInt();
        while(op>0){
            Pessoa pessoa = new Pessoa();
            pessoa.setFirstName(in.next());
            pessoa.setLastName(in.next());

            // DateFormat.getDateInstance("DD-MM-YY");

            pessoa.setCpf(in.next());
            listPessoa.add(pessoa);
            op--;
        }

        in.close();

        for (Pessoa pessoa : listPessoa) {
            System.out.println(pessoa.toString());
        }
        

    }
}
