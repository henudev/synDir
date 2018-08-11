package proxy.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PublicKey;

public class ProxyHandler implements InvocationHandler {
    
    //我们要代理的真实对象
    private Object tar;
    
    //绑定委托对象，并返回代理类
    public Object bind (Object tar) {
        this.tar = tar;
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),  //一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
                tar.getClass().getInterfaces(),     //一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，
                                                    // 那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
                this);  //一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        Object result = null;
        //这里可以进行AOP编程
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar, args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}
