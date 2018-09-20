package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: q16926
 * @Date: 2018/9/19 11:11
 * @Description:
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before (Method method, Object[] args, Object object) {  //目标方法调用前执行
        String clientName = (String) args[0];   
        System.out.println("hey! mr." + clientName);   
    }

}
