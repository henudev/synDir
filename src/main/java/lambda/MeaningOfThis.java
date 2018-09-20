package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MeaningOfThis
 * @Description TODO
 * @Author q16926
 * @Date 2018/9/11 18:45
 * @Version 1.0
 **/
public class MeaningOfThis {
    public final int value = 4;
    
    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value  = 5;
            
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }
    
    public static void main(String[] args){
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
        
        Runnable r = () -> System.out.println("sss");
        r.run();
        
        //test boolean 
        List<String> list = new ArrayList<String>();
        list.add("1");
        Runnable b = () -> System.out.println(list.isEmpty());
        b.run();
    }
}
