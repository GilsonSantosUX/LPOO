import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q3{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> listPessoa = new LinkedList<String>();
    
        for(int i=0;i<6;i++){
            listPessoa.add(in.next());
        }

        System.out.print("[");
            for (int i=0;i<listPessoa.size();i++) {
                System.out.print(listPessoa.get(i));
                if(listPessoa.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");
    
        Collections.sort(listPessoa);
    
        System.out.print("[");
            for (int i=0;i<listPessoa.size();i++) {
                System.out.print(listPessoa.get(i));
                if(listPessoa.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");
    
        String search = in.next();
    
        for(String ps : listPessoa){
            if(ps.compareTo(search.toString()) == 0){
                listPessoa.remove(ps);
                break;
            }
        }
    
        System.out.print("[");
            for (int i=0;i<listPessoa.size();i++) {
                System.out.print(listPessoa.get(i));
                if(listPessoa.size() <= i+1) continue;
                else System.out.print(", ");
            }
        System.out.println("]");
    
    }

}