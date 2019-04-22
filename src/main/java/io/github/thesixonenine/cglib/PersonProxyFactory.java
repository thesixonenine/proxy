package io.github.thesixonenine.cglib;

/**
 * @author simple
 * @date 2018/3/21 19:05
 */
public class PersonProxyFactory {

    public static Person newCglibProxy() {
        CgLibProxy cglibProxy = CgLibProxy.getInstance();
        return cglibProxy.getProxy(Person.class);
    }
}
