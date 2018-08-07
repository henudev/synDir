package proxy;

// import sun.org.mozilla.javascript.internal.ObjArray;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class CachedProviderHandler implements InvocationHandler {
    private Map<String, Object> cached = new HashMap<>();
    private Object target;

    public CachedProviderHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Type[] types = method.getParameterTypes();
        if (method.getName().matches("get.+") && (types.length == 1) &&
                (types[0] == String.class)) {
            
        }
        return null;
    }
}
