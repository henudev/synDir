package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author q16926
 * @Date 2018/9/10 10:56
 * @Version 1.0
 **/
public class MapTest {
    /**
     * @Author 
     * @Description 遍历MAP 
     * @Date  
     * @Param 
     * @return 
     **/
    public static void workMap(Map<String, String> map) {
        map.put("test1", "1");
        map.put("test2", "2");
        
        Collection<String> str  = map.values();
        
        Iterator iterator = str.iterator();
        
        iterator.forEachRemaining(System.out::println);
    }
}
