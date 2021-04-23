import java.io.IOException;
import java.util.*;

class Core implements Runnable{
    private int core;

    public Core(){
        this.core = Runtime.getRuntime().availableProcessors();
    }
    
    public void run(){
        System.out.println("Core:"+core);
    }

}

public class Threds{


    // public static void executa(){
    //     try {
    //         Runtime.getRuntime().exec("\n");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    public static void main(String[] args){
        Thread[] thread = new Thread[10];
        for(int i=0;i<thread.length;i++){
            thread[i] = new Thread(new Core());
            thread[i].start();
        }
        // int cores = Runtime.getRuntime().availableProcessors();
        // System.out.println(cores);
        
    }

    
}