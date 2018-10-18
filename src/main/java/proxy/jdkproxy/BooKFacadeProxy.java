package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BooKFacadeProxy implements InvocationHandler {

    private Object target;  //业务实现类对象，用来调用具体业务方法

    /**
     * 绑定业务对象，并返回一个代理类
     * @param target
     * @return
     */

    public Object bind(Object target) {
        this.target = target;

        //通过反射机制，创建一个代理类对象实例并返回，用户进行方法调用时使用
        //创建代理对象时，需要传递该业务类得类加载器（用来获取业务实现类得元数据，在包装方法时调用真正得业务方法，）、接口、handler实现类
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;


        System.out.println("Beafore -----");
        result = method.invoke(target, args);
        System.out.println("After ------");
        return result;
    }

}
