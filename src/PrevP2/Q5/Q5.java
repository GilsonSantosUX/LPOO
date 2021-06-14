import java.util.Scanner;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 implements Comparable<Object>{
    private String nomeQ5;
    private String cpf;

    public void setNomeQ5(String nomeQ5){
        this.nomeQ5 = nomeQ5;
    }

    public String getNomeQ5(){
        return this.nomeQ5;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Q5(String nomeQ5,String cpf){
        this.nomeQ5 = nomeQ5;
        this.cpf = cpf;
    }

    public int compareTo(Object prod){
        Q5 o = (Q5) prod;
        return this.getNomeQ5().compareTo(o.getNomeQ5());
    }

    public String toString(){
        return this.getNomeQ5().toString();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Q5> listaQ5 = new ArrayList<Q5>();
        Q5 Q5;

        for(int i=0;i<5;i++){
            Q5 = new Q5(in.next());
            listaQ5.add(Q5);
        }

        Q5 search = new Q5(in.next());

        System.out.print("[");
            for (int i=0;i<listaQ5.size();i++) {
                System.out.print(listaQ5.get(i));
                if(listaQ5.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");

        Collections.sort(listaQ5);

        System.out.print("[");
        for (int i=0;i<listaQ5.size();i++) {
            System.out.print(listaQ5.get(i));
            if(listaQ5.size() <= i+1) continue;
            else System.out.print(", ");
        }
        System.out.println("]");

        boolean isTrue = false;

        for (Q5 prod : listaQ5) {
            if(prod.compareTo(search) == 0){
                isTrue = true;
                break;
            }
        }

        if(isTrue) System.out.println("encontrado");
        else System.out.println("não encontrado");

    }
}