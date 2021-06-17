import java.util.*;
public class Q3{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        int qtdOp = 5;

        for(int i=0;i<qtdOp;i++){
            lista.add(in.next());
        }

        System.out.println(lista.toString());

        Collections.sort(lista);

        System.out.println(lista.toString());

        try{
            int search = in.nextInt();
            
            for(String ps : lista){
                if(lista.get(search).equals(ps)){
                    System.out.println(lista.get(search));
                    break;
                }
            }

        }catch(InputMismatchException exp){
            System.out.println("Entrada inválida!");
        }catch(IndexOutOfBoundsException exp){
            System.out.println("Índice inválido!");
        }

        in.close();
    }
}
