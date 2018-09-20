package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: q16926
 * @Date: 2018/9/19 14:46
 * @Description:
 */
public class GreetingAferAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, 
                               Object target) throws Throwable {
        System.out.println("please enjoy yourself");
    }
}
