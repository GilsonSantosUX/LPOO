import java.util.Scanner;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Produto implements Comparable<Object>{
    private String nomeProduto;

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public Produto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public int compareTo(Object prod){
        Produto o = (Produto) prod;
        // return this.nomeProduto.equals(o.getNomeProduto()) ? 1 : 0;
        return this.getNomeProduto().compareTo(o.getNomeProduto());
    }

    public String toString(){
        return this.getNomeProduto().toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto produto;

        for(int i=0;i<5;i++){
            produto = new Produto(in.next());
            listaProduto.add(produto);
        }

        Produto search = new Produto(in.next());

        System.out.print("[");
            for (int i=0;i<listaProduto.size();i++) {
                System.out.print(listaProduto.get(i));
                if(listaProduto.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");

        Collections.sort(listaProduto);

        System.out.print("[");
        for (int i=0;i<listaProduto.size();i++) {
            System.out.print(listaProduto.get(i));
            if(listaProduto.size() <= i+1) continue;
            else System.out.print(", ");
        }
        System.out.println("]");

        boolean isTrue = false;

        for (Produto prod : listaProduto) {
            if(prod.compareTo(search) == 0){
                isTrue = true;
                break;
            }
        }

        if(isTrue) System.out.println("encontrado");
        else System.out.println("não encontrado");

    }
}