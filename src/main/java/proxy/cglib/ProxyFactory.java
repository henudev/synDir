package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @auther: q16926
 * @date: 2018/10/18 15:38
 * @description:
 */
public class ProxyFactory implements MethodInterceptor {
    //业务类对象,供代理方法进行真正的业务方法调用
    private Object object;
    
    //相当于JDK动态代理中的绑定
    public Object createProxy(Object target) {
        //给业务对象赋值
        this.object = target;

        Enhancer enhancer = new Enhancer();    //创建加强器,用来创建动态代理类
        enhancer.setSuperclass(this.object.getClass());     //为加强器指定要代理的业务类,即:为下面生成的代理类指定父类
        enhancer.setCallback(this);     //设置回调,对于代理类上所有方法的调用都会调用Callback,而callback则需要interrupt方法进行
        //拦截
        enhancer.setClassLoader(this.getClass().getClassLoader());      
        //创建动态代理对象并返回
        return enhancer.create();
    }
    
    
    
    //实现回调
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        
        Object result = null;
        try {
            before();
            result = methodProxy.invokeSuper(o, objects);
            after();
        } catch (Exception e) {
            exception();
        }finally {
            beforeReturning();

        }
        return result;
    }

    private void before() {
        System.out.println("before method invoke");
    }
    private void after() {
        System.out.println("after method invoke");
    }
    private void exception() {
        System.out.println("method invoke exception");
    }
    private void beforeReturning() {
        System.out.println("before returning");
    }


}
