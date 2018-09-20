package aop;

/**
 * @Auther: q16926
 * @Date: 2018/9/19 10:55
 * @Description:
 */
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
