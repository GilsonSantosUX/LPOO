import java.util.Scanner;

public class ImpostoIRRF{
    private double salario;
    private final double faixa1 = 1903.99;
    private final double faixa2 = 2826.66;
    private final double faixa3 = 3751.06;
    private final double faixa4 = 4664.69;

    private final double IRRF1 = 0.075;
    private final double IRRF2 = 0.150;
    private final double IRRF3 = 0.225;
    private final double IRRF4 = 0.275;

    private final double deducao1 = 142.80;
    private final double deducao2 = 354.80;
    private final double deducao3 = 636.13;
    private final double deducao4 = 869.36;

    public double getSalario(){
        return this.salario;
    }


    public ImpostoIRRF(double salario){
        this.salario = salario;
    }

    public double calcularIRRF(){
        double salarioLiquido;

        if(this.getSalario() <= (faixa1-0.001))
            salarioLiquido = 0.00;
        else if(this.getSalario() >= faixa1 && this.getSalario() < (faixa2-0.001))
            salarioLiquido = (this.salario * IRRF1) - deducao1;
        else if(this.getSalario() >= faixa2 && this.getSalario() < (faixa3-0.001))
            salarioLiquido = (this.salario * IRRF2) - deducao2;
        else if(this.getSalario() >= faixa3 && this.getSalario() < (faixa4-0.001))
            salarioLiquido = (this.salario * IRRF3) - deducao3;
        else
            salarioLiquido = (this.salario * IRRF4) - deducao4;

        return salarioLiquido;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ImpostoIRRF funcionario = new ImpostoIRRF(in.nextDouble());
        System.out.printf("R$ %.2f\n",funcionario.calcularIRRF());
    }
    
}
