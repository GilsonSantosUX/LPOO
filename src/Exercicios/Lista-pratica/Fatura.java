import java.util.Scanner;

public class Fatura {
    private String descrition;
    private int qtditens;
    private float valor;

    public String getDescrition(){
        return this.descrition;
    }

    public int getQtdItens(){
        return this.qtditens;
    }

    public float getValor(){
        return this.valor;
    }

    public void setValores(String descrition,int qtdItens,float valor){
        this.descrition = descrition;
        this.qtditens = qtdItens;
        this.valor = valor;
    }

    public void lerItem(){
        Scanner in = new Scanner(System.in);
        this.setValores(in.next(), in.nextInt(), in.nextFloat());
        in.close();
    }
    
    public float getPrecoTotal(){
        return this.getValor()*this.getQtdItens();
    }

    Fatura(){};

    public static void main(String[] args){
        Fatura fatura1 = new Fatura();
        fatura1.lerItem();
        System.out.println(fatura1.getQtdItens()+" x "+fatura1.getDescrition()+" = "+fatura1.getPrecoTotal());
    }

}
