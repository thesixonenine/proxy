package io.github.thesixonenine.cglib;

import io.github.thesixonenine.direct.MonitorSession;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author simple
 * @date 2018/3/21 19:09
 */
public class CgLibProxy implements MethodInterceptor {

    private static CgLibProxy instance = new CgLibProxy();
    private Enhancer enhancer = new Enhancer();

    private CgLibProxy() {
    }

    public static CgLibProxy getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2,
                            MethodProxy arg3) throws Throwable {
        MonitorSession.begin(arg1.getName());
        Object obj = arg3.invokeSuper(arg0, arg2);
        MonitorSession.end();
        return obj;
    }
}
