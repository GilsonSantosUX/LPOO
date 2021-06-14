import java.util.Scanner;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

class Main implements Comparable<Object>{
    private String nomePaciente;
    private int idade;

    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }

    public String getNomePaciente(){
        return this.nomePaciente;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public Main(String nomePaciente,int idade){
        this.nomePaciente = nomePaciente;
        this.idade = idade;
    }

    public int compareTo(Object prod){
        Main o = (Main) prod;
        return this.getNomePaciente().compareTo(o.getNomePaciente());
    }

    public String toString(){
        return "Nome: "+this.getNomePaciente().toString()+"-idade: "+this.getIdade();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdOp = 5;
        List<Main> listPessoa = new LinkedList<Main>();
        Main paciente;
    
        for(int i=0;i<qtdOp;i++){
            paciente = new Main(in.next(),in.nextInt());
            listPessoa.add(paciente);
        }

        System.out.print("[");
            for (int i=0;i<listPessoa.size();i++) {
                System.out.print(listPessoa.get(i));
                if(listPessoa.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");
            
        Collections.reverse(listPessoa);
    
        for (int i=0;i<listPessoa.size();i++) {
            System.out.print(listPessoa.get(i));
            System.out.print(", ");
        }
    
    }
}
