package aop;


import org.aopalliance.aop.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @Auther: q16926
 * @Date: 2018/9/19 14:05
 * @Description:
 */
public class BeforeAdviceTest {
    
    @Test
    public void before() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        //after method
        AfterReturningAdvice advice1 = new GreetingAferAdvice();
        
        //环绕增强
        GreetingInterceptor greetingInterceptor = new GreetingInterceptor(); 
        //spring 提供proxyFactory
        ProxyFactory pf = new ProxyFactory();
        
        //set proxy target
        pf.setTarget(target);
        //add advice
        pf.addAdvice(advice);
        pf.addAdvice(advice1);
        pf.addAdvice((Advice) greetingInterceptor);
        //Create proxy instance
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("tom");
        proxy.serveTo("litchi");
    }
}
