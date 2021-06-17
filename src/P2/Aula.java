import java.util.*;

public class Aula implements Comparable<Object>{

    private String titulo;
    private int tempo;

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public int compareTo(Object prod) {
        Aula o = (Aula) prod;
        return this.getTitulo().compareTo(o.getTitulo());
    }

    @Override
    public String toString() {
        return "Titulo: "+this.getTitulo().toString()+" tempo: "+this.getTempo();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Aula> aulas = new ArrayList<Aula>();
        Aula aula;
        int qtdOP = 5;
        
        for(int i=0;i<qtdOP;i++){
            aula = new Aula(in.next(),in.nextInt());
            aulas.add(aula);
        }

        System.out.println(aulas);
        int search = in.nextInt();
        aulas.remove(search);

        System.out.println(aulas);

        in.close();
    }

}
