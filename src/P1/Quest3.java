public class Quest3 {
    public static void main(String[] args){
        int linha = 10;

        for(int i=0;i<linha;i++){
            if(i>5){
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }

        for(int i=0;i<linha;i++){
            if(i>5){
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
        }
    }
    
}
