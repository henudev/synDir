package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Auther: q16926
 * @Date: 2018/9/19 14:56
 * @Description:
 */
public class GreetingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();  //目标方法入参
        String clientName = (String) args[0];
        System.out.println("r u ok" + clientName);
        
        Object object = invocation.proceed();   //通过反射机制调用目标方法
        
        System.out.println("r u ok after");
        return object;
    }
}
