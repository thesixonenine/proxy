package io.github.thesixonenine.jdk;

import io.github.thesixonenine.direct.Speakable;

/**
 * @author simple
 * @date 2018/3/21 19:05
 */
public class PersonProxyFactory {

    public static Speakable newJdkProxy() {
        // 代理PersonImpl
        DynamicProxy dynamicProxy = new DynamicProxy(new PersonImpl());
        return dynamicProxy.getProxy();
    }
}
